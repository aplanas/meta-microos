SUMMARY = "Qt 5 X11 Extras Addon"
DESCRIPTION = "Qt X11 Extras enables the Qt programmer to write applications for the \
Linux/X11 platform. (Applications developed with Qt can also be \
deployed across several other desktop and embedded operating systems \
without having to rewrite the source code.)"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde0"

RPM_NAME = "libQt5X11Extras5-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "c1203afcae09fa6c4be0a4d31eb3b1648ac8101850b80051002bdd5f71d998ef11eff4ddd0e81ff6e2a997abf8fd7b6e009f749ba4a7a53340af232fa362cca6"

RPROVIDES:${PN} += "libQt5X11Extras.so.5 \
libQt5X11Extras5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Gui5 \
libc.so.6"

inherit rpm
