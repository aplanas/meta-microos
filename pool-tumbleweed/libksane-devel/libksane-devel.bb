SUMMARY = "Development files for the KDE scanning library"
DESCRIPTION = "This package contains a library to add scan support to KDE \
applications."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "23.08.0"

RPM_NAME = "libksane-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "052dc37d5895a68d2405412153f97cd862b542a063d61107c69401f495fb1ff6680f2b2a8fbef4abb487a3b6cb33066f5d09f5324cfc0d170d78d1afe60f4101"

RPROVIDES:${PN} += "cmake-KF5Sane \
libksane-devel \
libksane-kf5-devel"

RDEPENDS:${PN} += "cmake-KF5Wallet \
cmake-KF5WidgetsAddons \
cmake-Qt5Widgets \
libKF5Sane5 \
pkgconfig \
sane-backends-devel"

inherit rpm
