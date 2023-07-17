SUMMARY = "Development files for the Qt5 testing library"
DESCRIPTION = "Development files for the Qt5 testing library."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5Test-devel-5.15.10+kde129-2.1.aarch64.rpm"
RPM_HASH = "6d43bdcf0e842f5edcc074df304eb2644566eae92b762b8f0cef6fa7ac06feef5e097e2c7b9892e9d0d9e439b797911ea3f4973a9fc19e06ebf6648218086bc5"

RPROVIDES:${PN} += "cmake-Qt5Test \
libQt5Test-devel \
pkgconfig-Qt5Test"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Core-devel \
libQt5Test5 \
pkgconfig-Qt5Core"

inherit rpm
