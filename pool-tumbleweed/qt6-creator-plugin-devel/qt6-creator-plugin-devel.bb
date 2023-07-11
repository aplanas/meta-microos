SUMMARY = "Qt Creator Plugin Development Files"
DESCRIPTION = "This package contains all files from the Qt Creator source directory \
(aka QTC_SOURCE) necessary to compile plugins."
LICENSE = "BSD-3-Clause & GPL-3.0-only & GPL-3.0-with-Qt-Company-Qt-exception-1.1 & (LGPL-2.1-only | LGPL-3.0-only) & LGPL-3.0-only"

PV = "10.0.2"

RPM_NAME = "qt6-creator-plugin-devel-10.0.2-1.1.aarch64.rpm"
RPM_HASH = "38231409948069854de2dd9f5a5627c751d4fa2536fc43e5e5a8feb6e87f2964d7654d4cc08f49ae6be73107ab7083f066fee26b987d43d1ace9a380293d38d9"

RPROVIDES:${PN} += "cmake-QtCreator \
libqt5-creator-plugin-devel \
qt5-creator-plugin-devel \
qt6-creator-plugin-devel"

RDEPENDS:${PN} += "qt6-base-devel \
qt6-creator"

inherit rpm
