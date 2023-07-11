SUMMARY = "GTK+ UVC Viewer and Capturer"
DESCRIPTION = "A GTK interface for capturing and viewing video from devices \
supported by the Linux UVC driver, although it should also work with \
any v4l2 compatible device."
LICENSE = "GPL-3.0-only"

PV = "2.0.8"

RPM_NAME = "guvcview-qt5-2.0.8-1.5.aarch64.rpm"
RPM_HASH = "c32f735a2bf8c04ec9039e7a7f57d507aca27b5daa350cf3eb2b6b5c6ddce9228d578415e40943b139a76947f08c3aac3871c6d48a8637940cc93c8e226173ec"

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
