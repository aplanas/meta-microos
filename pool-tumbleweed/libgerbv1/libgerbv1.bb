SUMMARY = "Gerber File Viewer library"
DESCRIPTION = "Gerbv library , allows developers to include parsing, editing, exporting, \
rendering of Gerber files into other programs."
LICENSE = "GPL-2.0-only"

PV = "2.9.6"

RPM_NAME = "libgerbv1-2.9.6-1.4.aarch64.rpm"
RPM_HASH = "373b2e5e4665e00b0a955acf6996c596a46411906fd5060b7deff9185c03ad5f9179fb499a5a0a0d8672eedf2af41f86effbb27acf266ef0e6253ee9be0f48bc"

RPROVIDES:${PN} += "libgerbv.so.1 \
libgerbv1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6"

inherit rpm
