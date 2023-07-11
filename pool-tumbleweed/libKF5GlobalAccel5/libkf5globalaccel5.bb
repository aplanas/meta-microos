SUMMARY = "Global desktop keyboard shortcuts"
DESCRIPTION = "KGlobalAccel allows you to have global accelerators that are independent of \
the focused window.  Unlike regular shortcuts, the application's window does not \
need focus for them to be activated."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5GlobalAccel5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "dcf00a4f415403cc5f0f84ba1aa41cf92cfb8d6aa02a158b588298b0e520b1305927b66fc5504e2f61d26a377ccd1f127fe3114ca31470065a11b9f42ffdccd6"

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
