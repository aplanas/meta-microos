SUMMARY = "Python YAML parser c-library"
DESCRIPTION = "ruamel.yaml.clib is a YAML parser/emitter that supports roundtrip preservation \
of comments, seq/map flow style, and map key order. \
This package contains the C library counterpart of it."
LICENSE = "MIT"

PV = "0.2.7"

RPM_NAME = "python39-ruamel.yaml.clib-0.2.7-2.3.aarch64.rpm"
RPM_HASH = "ecf536ed8010c0855f5b33334d0173b6bb1fde8cee49ab2d4bf92c9e7a1bf201414e758aac7bbfc2ff368af411009522b8a33e995356c232c5b133174b042e6b"

RPROVIDES:${PN} += "python3.9dist-ruamel.yaml.clib \
python39-ruamel.yaml.clib \
python3dist-ruamel.yaml.clib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
