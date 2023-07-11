SUMMARY = "Python YAML parser c-library"
DESCRIPTION = "ruamel.yaml.clib is a YAML parser/emitter that supports roundtrip preservation \
of comments, seq/map flow style, and map key order. \
This package contains the C library counterpart of it."
LICENSE = "MIT"

PV = "0.2.7"

RPM_NAME = "python310-ruamel.yaml.clib-0.2.7-2.3.aarch64.rpm"
RPM_HASH = "e35ec3bed113ace13275b67d17373fcad80b97dbfc5723d8c75fbb786b6404e4b09deff3c175f3688550b52da214f55601eed8810ab7e7fb26c5178ee81ffb3d"

RPROVIDES:${PN} += "python3.10dist-ruamel.yaml.clib \
python310-ruamel.yaml.clib \
python3dist-ruamel.yaml.clib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
