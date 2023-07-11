SUMMARY = "Development files for the Single Sign On Framework's plugins"
DESCRIPTION = "This package contains the development files necessary for creating plugins for \
the Single Sign On Framework."
LICENSE = "LGPL-2.0-only"

PV = "8.60"

RPM_NAME = "signon-plugins-devel-8.60-2.19.aarch64.rpm"
RPM_HASH = "20bc442bb7a31dcd36898d5c3a25a52bf1df1bd948a373b8dc88e5e3af50ad75cfe128d781c11d7a0146877d8894a398e1a51ca1b22586714cf2ecffb447b808"

RPROVIDES:${PN} += "pkgconfig-signon-plugins \
pkgconfig-signon-plugins-common \
signon-plugins-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsignon-qt5-devel \
pkgconfig-libsignon-qt5 \
signon-plugins"

inherit rpm
