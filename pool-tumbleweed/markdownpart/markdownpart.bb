SUMMARY = "KPart for rendering Markdown content"
DESCRIPTION = "A(nother) Markdown viewer KParts plugin, which allows \
KParts-using applications to display files in \
Markdown format in the rendered target format. \
Examples are Ark, Krusader, Kate's preview plugin & Konqueror."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "markdownpart-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "98f010e442f99a46b727a6715f76197076fb4376e96db609a040cd4caccd731ba6ba0270530c6e992e73cbbf2dfcfb7c8e5c1ba1a227d2b49a61c41a711a2319"

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
