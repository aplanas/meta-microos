SUMMARY = "Development files for libsignon-qt1"
DESCRIPTION = "This package contains the development files for the signon-qt library."
LICENSE = "LGPL-2.0-only"

PV = "8.60"

RPM_NAME = "libsignon-qt5-devel-8.60-2.18.aarch64.rpm"
RPM_HASH = "edac879822af85849acd03d8dc4cdeaf5752e563bed0332fd1cb5afe136dac6787d41f6885333718600b76893d5835fe41f4cbb3cc1a6fa2812e1cbd98f1436f"

RPROVIDES:${PN} += "cmake-SignOnQt5 \
libsignon-qt5-devel \
pkgconfig-libsignon-qt5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsignon-qt5-1 \
pkgconfig-Qt5Core"

inherit rpm
