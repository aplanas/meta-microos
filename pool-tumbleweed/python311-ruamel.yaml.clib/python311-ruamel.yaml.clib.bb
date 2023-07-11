SUMMARY = "Python YAML parser c-library"
DESCRIPTION = "ruamel.yaml.clib is a YAML parser/emitter that supports roundtrip preservation \
of comments, seq/map flow style, and map key order. \
This package contains the C library counterpart of it."
LICENSE = "MIT"

PV = "0.2.7"

RPM_NAME = "python311-ruamel.yaml.clib-0.2.7-2.3.aarch64.rpm"
RPM_HASH = "3ebf80f2bb59814734b810c18830b267c14baa4b994f4c5084f6f1ad711ad8328b0ac4dfb556733398c34f830c64becea75535136d07494e47d1ddbb3fab4979"

RPROVIDES:${PN} += "python3-ruamel.yaml.clib \
python3.11dist-ruamel.yaml.clib \
python311-ruamel.yaml.clib \
python3dist-ruamel.yaml.clib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
