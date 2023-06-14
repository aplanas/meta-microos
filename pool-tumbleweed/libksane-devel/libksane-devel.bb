SUMMARY = "Development files for the KDE scanning library"
DESCRIPTION = "This package contains a library to add scan support to KDE \
applications."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "23.04.1"

RPM_NAME = "libksane-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "2472f749bc52074538ccc326953e50e95fb423bb76e2f93b2d22b7519caa7e7eb74031165794ffebb88ec0d14fa05f5c478acbc4461f9323a75065065d138fe1"

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
