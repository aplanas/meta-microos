SUMMARY = "KPart for rendering Markdown content"
DESCRIPTION = "A(nother) Markdown viewer KParts plugin, which allows \
KParts-using applications to display files in \
Markdown format in the rendered target format. \
Examples are Ark, Krusader, Kate's preview plugin & Konqueror."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "markdownpart-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "e52a6c432742f831f6e0a26d425f47368f100e3d75bf3f6e1cba0873ee381b425a779a4754facff10ae639b6375f1043bf3f1b887d65a7e80f548148b92f66dc"

RPROVIDES:${PN} += "markdownpart"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5Parts.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
