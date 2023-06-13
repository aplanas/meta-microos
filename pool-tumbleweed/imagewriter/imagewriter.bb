SUMMARY = "Utility for writing disk images to USB keys"
DESCRIPTION = "A graphical utility for writing raw disk images & hybrid ISOs to USB keys."
LICENSE = "GPL-2.0-only"

PV = "1.10.1432200249.1d253d9"

RPM_NAME = "imagewriter-1.10.1432200249.1d253d9-2.12.aarch64.rpm"
RPM_HASH = "6d3acde7322e9c78fbd896797e61dfb8621d69fd74b367d5bdfa5af798847915407fe30f7ebc63114aba953cadfb10b1946cd996fdae91cb28242997aafbad30"

RPROVIDES:${PN} += "application() \
application(imagewriter.desktop) \
imagewriter \
imagewriter(aarch-64) \
mimehandler(application/x-cd-image) \
mimehandler(application/x-raw-disk-image)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
xdg-utils"

inherit rpm
