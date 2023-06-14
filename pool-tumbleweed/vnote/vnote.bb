SUMMARY = "A Vim-inspired note-taking application, especially for Markdown"
DESCRIPTION = "VNote is a note-taking application, designed especially for Markdown. \
VNote provides both note management and Markdown edit experience."
LICENSE = "LGPL-3.0-only"

PV = "3.10.1"

RPM_NAME = "vnote-3.10.1-1.9.aarch64.rpm"
RPM_HASH = "f43f099e906207ccbbf85067c1399e031a55e3c0a0d5aac37cfa70e3a166e9603a9f371e5700a789625af6ef156f6ebc38db44a930bfbc8eac150c1ae0131d80"

RPROVIDES:${PN} += "vnote"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Sql.so.5 \
libQt5Svg.so.5 \
libQt5WebChannel.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libVTextEdit.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
