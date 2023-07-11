SUMMARY = "Level Editor for the JAG game"
DESCRIPTION = "The aim of JAG is to break all of the target pieces on each level, \
and to do this before the time runs out. Keep doing this until you \
have beaten the last level and won the game. \
 \
This package contains the level editor for JAG."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.8"

RPM_NAME = "jag-editor-0.3.8-2.12.aarch64.rpm"
RPM_HASH = "1a464cae41ae9dec2d6c8b1ce09124cd794d84a1271d2f23b4d3a17b5370328d46f6cfbd9fb2990e7a0c14fb40a8074ce8ddb7ad955ca874e15ddbdfde7bf94b"

RPROVIDES:${PN} += "jag-editor \
jag-level-editor"

RDEPENDS:${PN} += "jag \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
