SUMMARY = "Development package for qtdbusextended"
DESCRIPTION = "Header files and libraries for qtdbusextended."
LICENSE = "LGPL-2.1+"

PV = "0.0.3"

RPM_NAME = "qtdbusextended-devel-0.0.3-1.8.aarch64.rpm"
RPM_HASH = "24b50111f90ff934489a8f36d43c15c87862722d697892be422edcc816e60b7b1ffb5ad28e864b798b6359ee47dcf4a58c825f9e065f68b3fc93503ae345c707"

RPROVIDES:${PN} += "pkgconfig(dbusextended-qt5) \
qtdbusextended-devel \
qtdbusextended-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdbusextended-qt5-1 \
pkgconfig(Qt5Core) \
pkgconfig(Qt5DBus)"

inherit rpm
