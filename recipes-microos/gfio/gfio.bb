SUMMARY = "Graphical front end for fio"
DESCRIPTION = "gfio is a gtk based graphical front-end for fio.  It is often installed on the \
testers workstation whereas fio would be installed on the server."
LICENSE = "GPL-2.0-only"

PV = "3.34"

RPM_NAME = "gfio-3.34-2.1.aarch64.rpm"
RPM_HASH = "a7473fbd65211f6064f4c9f8e4440509848f2f93914e38c7f64173a0b2261811ed10b67dc768251463c07406de1513075a126bb75f902d0033bdbfc1a018fcfd"

RPROVIDES:${PN} += "gfio \
gfio(aarch-64)"
RDEPENDS:${PN} += "fio \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libaio.so.1()(64bit) \
libaio.so.1(LIBAIO_0.1)(64bit) \
libaio.so.1(LIBAIO_0.4)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libcurl.so.4()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgfapi.so.0()(64bit) \
libgfapi.so.0(GFAPI_3.4.0)(64bit) \
libgfapi.so.0(GFAPI_6.0)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libibverbs.so.1()(64bit) \
libibverbs.so.1(IBVERBS_1.0)(64bit) \
libibverbs.so.1(IBVERBS_1.1)(64bit) \
libiscsi.so.9()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libnbd.so.0()(64bit) \
libnbd.so.0(LIBNBD_1.0)(64bit) \
libnuma.so.1()(64bit) \
libnuma.so.1(libnuma_1.1)(64bit) \
libnuma.so.1(libnuma_1.2)(64bit) \
librados.so.2()(64bit) \
librbd.so.1()(64bit) \
librdmacm.so.1()(64bit) \
librdmacm.so.1(RDMACM_1.0)(64bit) \
libz.so.1()(64bit)"

inherit rpm
