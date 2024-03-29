SUMMARY = "GTK+ UVC Viewer and Capturer"
DESCRIPTION = "A GTK interface for capturing and viewing video from devices \
supported by the Linux UVC driver, although it should also work with \
any v4l2 compatible device."
LICENSE = "GPL-3.0-only"

PV = "2.0.8"

RPM_NAME = "guvcview-2.0.8-1.7.aarch64.rpm"
RPM_HASH = "e423919cfea3d345d3bd56ce521cf16501a60e46f1c3f7c671db7a309cd11f044bd6d50e9cfc8b9541d11578fea5e1366f254a65152c6395bf8a0b50b6ff87f1"

RPROVIDES:${PN} += "guvcview"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgviewaudio-2.0.so.2 \
libgviewencoder-2.1.so.2 \
libgviewrender-2.1.so.2 \
libgviewv4l2core-2.1.so.2 \
libm.so.6"

inherit rpm
