SUMMARY = "Personal Accounting Application"
DESCRIPTION = "Grisbi is a personal accounting application, aiming at providing the most \
simple and intuitive software for basic use, although it can be very powerful \
if you spend a little time on the setup. \
 \
One notable feature is that it respects French accounting rules."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.5"

RPM_NAME = "grisbi-2.0.5-1.8.aarch64.rpm"
RPM_HASH = "e36f85b2dc67b0b0e1651de80ab1cf0dad82c750d8140955a210f4ff33da494516fa2280742fdb02b1266cda98500073c6c1fc119387369bf565643faf71a241"

RPROVIDES:${PN} += "application() \
application(grisbi.desktop) \
grisbi \
grisbi(aarch-64) \
mimehandler(application/x-grisbi)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libcrypto.so.3()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgoffice-0.10.so.10()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libofx.so.7()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libxml2.so.2()(64bit) \
libz.so.1()(64bit)"

inherit rpm
