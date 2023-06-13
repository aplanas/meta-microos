SUMMARY = "Development files for the Qt5 Tools library"
DESCRIPTION = "You need this package if you want to compile programs with qttools."
LICENSE = "(LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)) & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "5.15.9+kde1"

RPM_NAME = "libqt5-qttools-devel-5.15.9+kde1-1.1.aarch64.rpm"
RPM_HASH = "5a50aae54c5bbdffe948eabf84abaacf35a51d0ef4789a51e3e95fbead85d2c1d9063f7086fa84dc5455605d6b42b6afaa647eb63dc40cae7591022114232e03"

RPROVIDES:${PN} += "cmake(Qt5Designer) \
cmake(Qt5DesignerComponents) \
cmake(Qt5Help) \
cmake(Qt5UiPlugin) \
cmake(Qt5UiTools) \
libqt5-qttools-devel \
libqt5-qttools-devel(aarch-64) \
pkgconfig(Qt5Designer) \
pkgconfig(Qt5Help) \
pkgconfig(Qt5UiPlugin) \
pkgconfig(Qt5UiTools)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Designer5 \
libQt5DesignerComponents5 \
libQt5Help5 \
libqt5-linguist-devel \
libqt5-qttools-qhelpgenerator \
libxslt-devel \
pkgconfig(Qt5Core) \
pkgconfig(Qt5Gui) \
pkgconfig(Qt5Sql) \
pkgconfig(Qt5UiPlugin) \
pkgconfig(Qt5Widgets) \
pkgconfig(Qt5Xml)"

inherit rpm
