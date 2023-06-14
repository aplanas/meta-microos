SUMMARY = "Global desktop keyboard shortcuts"
DESCRIPTION = "KGlobalAccel allows you to have global accelerators that are independent of \
the focused window.  Unlike regular shortcuts, the application's window does not \
need focus for them to be activated."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5GlobalAccel5-5.106.0-2.1.aarch64.rpm"
RPM_HASH = "1b48488ff3bbfb59cccaff2641dca1d49db453deae80ab015eeaba24fdaf6e0a9c189405f9a07d763aeb24d0ae74a0e4590c9daaeaec8319b67e41e8c6ba6c5e"

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
