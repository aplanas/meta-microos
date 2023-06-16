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

RPM_NAME = "leechcraft-azoth-modnok-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "a85f19fa9ea80eca18bcea16fe80b3ce7aefec589a316940b87fb78e62900e703400adb0af71d8d058ea7a4a26e1bacabd948a09258687f08d59924c6a37e7bd"

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
