SUMMARY = "Gerber File Viewer library"
DESCRIPTION = "Gerbv library , allows developers to include parsing, editing, exporting, \
rendering of Gerber files into other programs."
LICENSE = "GPL-2.0-only"

PV = "2.9.6"

RPM_NAME = "libgerbv1-2.9.6-1.3.aarch64.rpm"
RPM_HASH = "3c59275738bd116448c5cb0573a676ef7581b5c2973f075a83482ed52abc578e26d176bdc19356949acf9c54324a47c646fb8b22a167417d19b6609db184dcc9"

RPROVIDES:${PN} += "libgerbv.so.1()(64bit) \
libgerbv1 \
libgerbv1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libm.so.6()(64bit)"

inherit rpm
