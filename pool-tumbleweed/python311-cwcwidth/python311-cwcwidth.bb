SUMMARY = "Python bindings for wc(s)width"
DESCRIPTION = "Python bindings for wc(s)width"
LICENSE = "MIT"

PV = "0.1.8"

RPM_NAME = "python311-cwcwidth-0.1.8-1.7.aarch64.rpm"
RPM_HASH = "93ca7234c97ad4e35374106c180c0ed802116803f73bab93022ca7f61d146db0518fd8c3735189a82da15998bd8632d82292d227e87367033edb59458718c17c"

RPROVIDES:${PN} += "python3-cwcwidth \
python3.11dist-cwcwidth \
python311-cwcwidth \
python3dist-cwcwidth"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
