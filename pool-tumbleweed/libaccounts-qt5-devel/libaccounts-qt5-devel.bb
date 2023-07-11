SUMMARY = "Development files for libaccounts-qt"
DESCRIPTION = "This package contains the development files for the accounts-qt library."
LICENSE = "LGPL-2.1-only"

PV = "1.16"

RPM_NAME = "libaccounts-qt5-devel-1.16-1.19.aarch64.rpm"
RPM_HASH = "463667a39cd87c5e7b4b6146ebbe7f2ac75416de38b6ad6d52174bd55c33d793fb275a432d9444a70acf73863ef335bf21c79efe4f616f9d1090a14a2727d917"

RPROVIDES:${PN} += "cmake-AccountsQt5 \
libaccounts-qt5-devel \
pkgconfig-accounts-qt5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libaccounts-qt5-1 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Xml"

inherit rpm
