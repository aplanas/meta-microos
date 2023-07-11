SUMMARY = "Python bindings for wc(s)width"
DESCRIPTION = "Python bindings for wc(s)width"
LICENSE = "MIT"

PV = "0.1.8"

RPM_NAME = "python310-cwcwidth-0.1.8-1.7.aarch64.rpm"
RPM_HASH = "52670af68d9e5ff7eec78c6a3f8a1e8614a1cbf487f5695c3d904b490472756f3c2fe71b358a66aeec0afa3815c52aefdc718877c4b9816b30f2d4c5b819bad0"

RPROVIDES:${PN} += "python3.10dist-cwcwidth \
python310-cwcwidth \
python3dist-cwcwidth"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
