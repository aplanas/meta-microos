SUMMARY = "GTK+ UVC Viewer and Capturer"
DESCRIPTION = "A GTK interface for capturing and viewing video from devices \
supported by the Linux UVC driver, although it should also work with \
any v4l2 compatible device."
LICENSE = "GPL-3.0-only"

PV = "2.0.8"

RPM_NAME = "guvcview-qt5-2.0.8-1.4.aarch64.rpm"
RPM_HASH = "1d4cc816b3d6440fc38af9c9285a54b8918ac3030e540223d5b926095647a356767393304871bd77e295213f4c3a0e23559f9c7b96021499034835a6026f6128"

RPROVIDES:${PN} += "guvcview-qt5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libgviewaudio-2.0.so.2 \
libgviewencoder-2.1.so.2 \
libgviewrender-2.1.so.2 \
libgviewv4l2core-2.1.so.2 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
