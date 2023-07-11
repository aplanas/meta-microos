SUMMARY = "Python bindings for wc(s)width"
DESCRIPTION = "Python bindings for wc(s)width"
LICENSE = "MIT"

PV = "0.1.8"

RPM_NAME = "python39-cwcwidth-0.1.8-1.7.aarch64.rpm"
RPM_HASH = "a4249bda932ebffb3c6aa90d9ad442f137c3bda835901cf803f38e7a2a2a8bf405f775665982cea7141c479e7beeaf6c7efe58d2664b1ab7f9e691b8ecbf0f9e"

RPROVIDES:${PN} += "python3.9dist-cwcwidth \
python39-cwcwidth \
python3dist-cwcwidth"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
