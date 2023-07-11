SUMMARY = "Development files for the Qt5 testing library"
DESCRIPTION = "Development files for the Qt5 testing library."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5Test-devel-5.15.10+kde129-1.1.aarch64.rpm"
RPM_HASH = "541caaa32bd170665f22ec1bc99add1c21dd3cb6e3baee12bc01c0b8a0987751a9311b3fcc2c56a78e2adcf8e446a8f2810a80d30db2f5f6eb9a3a4d8394bad6"

RPROVIDES:${PN} += "cmake-Qt5Test \
libQt5Test-devel \
pkgconfig-Qt5Test"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Core-devel \
libQt5Test5 \
pkgconfig-Qt5Core"

inherit rpm
