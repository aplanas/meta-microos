SUMMARY = "Development files for libadwaita-qt5"
DESCRIPTION = "The libadwaita-qt5-devel package contains libraries and header files for \
developing applications that use libadwaita-qt5-1."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.4.2"

RPM_NAME = "libadwaita-qt5-devel-1.4.2-3.3.aarch64.rpm"
RPM_HASH = "10bed98d03545e2b18a8d61ab56fbfaa3ed951c0803aaf7ac7c93a6b5e8cd025780e0a808f360eeaa7574f06e50b7555c7715f582b9630ba8a696b192958a132"

RPROVIDES:${PN} += "cmake(AdwaitaQt) \
libadwaita-qt5-devel \
libadwaita-qt5-devel(aarch-64) \
libadwaitaqt-devel \
pkgconfig(adwaita-qt)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libadwaitaqt5-1 \
pkgconfig(Qt5Core) \
pkgconfig(Qt5Widgets)"

inherit rpm
