SUMMARY = "Shortcut utility library for LeechCraft"
DESCRIPTION = "A library easing shortcut usage in LeechCraft, particularly the \
configurable shortcuts subsystem."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "libleechcraft-util-shortcuts-qt5-0_6_75-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "9fc5a630c821fca161a080754930025184da15370723a95a7cdb04886ad499d632da0ab668cafcd46eb67f6fd8f2c196b8278a4ad6b06ee3af599c142f65e5e8"

RPROVIDES:${PN} += "libleechcraft-util-shortcuts-qt5-0-6-75 \
libleechcraft-util-shortcuts-qt5.so.0.6.75"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
