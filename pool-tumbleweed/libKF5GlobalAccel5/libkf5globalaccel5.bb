SUMMARY = "Global desktop keyboard shortcuts"
DESCRIPTION = "KGlobalAccel allows you to have global accelerators that are independent of \
the focused window.  Unlike regular shortcuts, the application's window does not \
need focus for them to be activated."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5GlobalAccel5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "9d40323d92bb2687e6eebf41640cb7eb21bd7070bf46c7e0a4b87a5cf9f0aac68b5d47fb2b5cff48d19c55a7ecd04b003e1917fc8066eb192eee6a7f9c3dec0e"

RPROVIDES:${PN} += "libKF5GlobalAccel.so.5 \
libKF5GlobalAccel5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5DBus5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Widgets5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
