SUMMARY = "KPart for rendering Markdown content"
DESCRIPTION = "A(nother) Markdown viewer KParts plugin, which allows \
KParts-using applications to display files in \
Markdown format in the rendered target format. \
Examples are Ark, Krusader, Kate's preview plugin & Konqueror."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "markdownpart-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "039945c5ad90302254c94c09c9110d3d5c28153ab8ae10b425d1fefb2dd2d9c3144a2f24f4ed7faa6792b2abc7777b071399c1e7c13b41c7223d5101b165bbb1"

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
