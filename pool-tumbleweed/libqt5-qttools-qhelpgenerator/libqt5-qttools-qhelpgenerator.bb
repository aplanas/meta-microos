SUMMARY = "Generator for Qt5 Help files (qch)"
DESCRIPTION = "Binaries for generating .qch help catalogs."
LICENSE = "(LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)) & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "5.15.9+kde1"

RPM_NAME = "libqt5-qttools-qhelpgenerator-5.15.9+kde1-1.1.aarch64.rpm"
RPM_HASH = "f3abd4ec2e65792a133dc52740035c370e9a2265bbb479dc9c5b4b068952af3936587604d024668ce8129aa8c2e7e7fdee7574589d53a3d64d3c754aadb720a6"

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
