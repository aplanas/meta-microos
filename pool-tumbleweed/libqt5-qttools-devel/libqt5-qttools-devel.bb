SUMMARY = "Development files for the Qt5 Tools library"
DESCRIPTION = "You need this package if you want to compile programs with qttools."
LICENSE = "(LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "5.15.10+kde3"

RPM_NAME = "libqt5-qttools-devel-5.15.10+kde3-1.1.aarch64.rpm"
RPM_HASH = "f47c92d20e98ab9506416fadba08d1a1173cd2225fa5818adf27981784b94bbb8bede58b0fa892b6d05b39859df5cdd225c1b48d84026ad31ac5cf9d22bcfe77"

RPROVIDES:${PN} += "cmake-Qt5Designer \
cmake-Qt5DesignerComponents \
cmake-Qt5Help \
cmake-Qt5UiPlugin \
cmake-Qt5UiTools \
libqt5-qttools-devel \
pkgconfig-Qt5Designer \
pkgconfig-Qt5Help \
pkgconfig-Qt5UiPlugin \
pkgconfig-Qt5UiTools"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Designer5 \
libQt5DesignerComponents5 \
libQt5Help5 \
libqt5-linguist-devel \
libqt5-qttools-qhelpgenerator \
libxslt-devel \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5Sql \
pkgconfig-Qt5UiPlugin \
pkgconfig-Qt5Widgets \
pkgconfig-Qt5Xml"

inherit rpm
