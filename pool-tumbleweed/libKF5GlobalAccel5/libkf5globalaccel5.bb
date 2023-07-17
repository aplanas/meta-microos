SUMMARY = "Global desktop keyboard shortcuts"
DESCRIPTION = "KGlobalAccel allows you to have global accelerators that are independent of \
the focused window.  Unlike regular shortcuts, the application's window does not \
need focus for them to be activated."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5GlobalAccel5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "376937f63fe8a787bed5577975ab683d66d99d821c71a919d1f5d0a8cb7bf0f9ea892f6f6c2170aff87fef4795285dc5bb5cf320017201f3f4f1651e87a66c5f"

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
