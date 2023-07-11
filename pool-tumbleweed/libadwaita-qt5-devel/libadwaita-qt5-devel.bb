SUMMARY = "Development files for libadwaita-qt5"
DESCRIPTION = "The libadwaita-qt5-devel package contains libraries and header files for \
developing applications that use libadwaita-qt5-1."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.4.2"

RPM_NAME = "libadwaita-qt5-devel-1.4.2-3.4.aarch64.rpm"
RPM_HASH = "592baad94aadfc2f4821871b077ee06543b039919ef860c3a31e5d328c86e058842af82e417e3c5f4d0cf0d07902d2e6765fdfbfad9ea53995394dc38a1e02b3"

RPROVIDES:${PN} += "cmake-AdwaitaQt \
libadwaita-qt5-devel \
libadwaitaqt-devel \
pkgconfig-adwaita-qt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libadwaitaqt5-1 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Widgets"

inherit rpm
