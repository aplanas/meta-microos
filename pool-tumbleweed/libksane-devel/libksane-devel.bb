SUMMARY = "Development files for the KDE scanning library"
DESCRIPTION = "This package contains a library to add scan support to KDE \
applications."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "23.04.3"

RPM_NAME = "libksane-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "f5e3e822b662714f94d5b460ac30aa6d5fa358268612359368cbc58ff94e3c0681490dd2f18be283e992e888480c75348d00104ca2e743c0c95e4867c459d9e1"

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
