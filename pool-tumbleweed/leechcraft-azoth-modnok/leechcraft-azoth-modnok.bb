SUMMARY = "LeechCraft Azoth LaTeX support Module"
DESCRIPTION = "This package provides a plugin for LeechCraft Azoth which \
can render and display LaTeX formulae directly in chat windows. \
 \
It does not depend on the underlying protocol, and if the protocol supports \
rich text formatting in outgoing messages, it is able to replace the formulas \
with corresponding images in outgoing messages as well, so your buddies would \
see nice rendered formulas instead of raw LaTeX code, even if their client \
does not have a LaTeX formatter."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-modnok-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "8cfce9a21d7bca77acbf96a450965628121f164c90f206ab08b8de4dcd5be7c3c4a3b90056bb5aaba9a9948cf44ebaee354847a2a97609cdd9b1fe71c5a1e286"

RPROVIDES:${PN} += "leechcraft-azoth-modnok \
libleechcraft-azoth-modnok.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
leechcraft-azoth \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
