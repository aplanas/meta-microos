SUMMARY = "Generator for Qt5 Help files (qch)"
DESCRIPTION = "Binaries for generating .qch help catalogs."
LICENSE = "(LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "5.15.10+kde3"

RPM_NAME = "libqt5-qttools-qhelpgenerator-5.15.10+kde3-1.1.aarch64.rpm"
RPM_HASH = "36c22b05620e0c8be3e49abc22f85fc29a39c87b658141360e2baeaa6ad6c4d0163212df576d9150956fb1edde7f7cdd13d2aefe45f910926a2835f3e023c15d"

RPROVIDES:${PN} += "libqt5-qttools-qhelpgenerator"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Help.so.5 \
libQt5Sql.so.5 \
libQt5Sql5-sqlite \
libc.so.6 \
libstdc++.so.6"

inherit rpm
