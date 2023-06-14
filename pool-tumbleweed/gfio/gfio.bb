SUMMARY = "Graphical front end for fio"
DESCRIPTION = "gfio is a gtk based graphical front-end for fio.  It is often installed on the \
testers workstation whereas fio would be installed on the server."
LICENSE = "GPL-2.0-only"

PV = "3.34"

RPM_NAME = "gfio-3.34-2.1.aarch64.rpm"
RPM_HASH = "a7473fbd65211f6064f4c9f8e4440509848f2f93914e38c7f64173a0b2261811ed10b67dc768251463c07406de1513075a126bb75f902d0033bdbfc1a018fcfd"

RPROVIDES:${PN} += "gfio"

RDEPENDS:${PN} += "fio \
ld-linux-aarch64.so.1 \
libaio.so.1 \
libc.so.6 \
libcairo.so.2 \
libcrypto.so.3 \
libcurl.so.4 \
libgdk-x11-2.0.so.0 \
libgfapi.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libibverbs.so.1 \
libiscsi.so.9 \
libm.so.6 \
libnbd.so.0 \
libnuma.so.1 \
librados.so.2 \
librbd.so.1 \
librdmacm.so.1 \
libz.so.1"

inherit rpm
