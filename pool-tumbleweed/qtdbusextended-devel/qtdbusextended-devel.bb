SUMMARY = "Development package for qtdbusextended"
DESCRIPTION = "Header files and libraries for qtdbusextended."
LICENSE = "LGPL-2.1+"

PV = "0.0.3"

RPM_NAME = "qtdbusextended-devel-0.0.3-1.9.aarch64.rpm"
RPM_HASH = "4f0c9052e14db19d338fa27cd0f7950ae0647416bd092d4eae19ac5ee01bc90e09fe848a3de170f25c8add5ca716bd5b35017240ffdffb44a0d4621a63eaf913"

RPROVIDES:${PN} += "pkgconfig-dbusextended-qt5 \
qtdbusextended-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdbusextended-qt5-1 \
pkgconfig-Qt5Core \
pkgconfig-Qt5DBus"

inherit rpm
