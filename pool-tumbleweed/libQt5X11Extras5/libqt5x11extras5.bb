SUMMARY = "Qt 5 X11 Extras Addon"
DESCRIPTION = "Qt X11 Extras enables the Qt programmer to write applications for the \
Linux/X11 platform. (Applications developed with Qt can also be \
deployed across several other desktop and embedded operating systems \
without having to rewrite the source code.)"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libQt5X11Extras5-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "c3e9e934ea2ceb34331da4f648cf6a1dbfec78590adbfd463561ac873c7bc39b9597a6b266743625adedc1d23685dc0a4c224beccdea271fd9d40237db93b139"

RPROVIDES:${PN} += "libQt5X11Extras.so.5 \
libQt5X11Extras5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Gui5 \
libc.so.6"

inherit rpm
