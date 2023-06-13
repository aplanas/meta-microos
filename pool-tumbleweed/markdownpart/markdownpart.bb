SUMMARY = "KPart for rendering Markdown content"
DESCRIPTION = "A(nother) Markdown viewer KParts plugin, which allows \
KParts-using applications to display files in \
Markdown format in the rendered target format. \
Examples are Ark, Krusader, Kate's preview plugin & Konqueror."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "markdownpart-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "e52a6c432742f831f6e0a26d425f47368f100e3d75bf3f6e1cba0873ee381b425a779a4754facff10ae639b6375f1043bf3f1b887d65a7e80f548148b92f66dc"

RPROVIDES:${PN} += "markdownpart \
markdownpart(aarch-64) \
metainfo() \
metainfo(org.kde.markdownpart.metainfo.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5Parts.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
