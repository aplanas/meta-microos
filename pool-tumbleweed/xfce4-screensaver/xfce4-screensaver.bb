SUMMARY = "Screensaver and locker for Xfce"
DESCRIPTION = "xfce4-screensaver is a screen saver and locker that integrates with the Xfce desktop. \
This software is not ready for production machines yet. Please use with caution. \
 \
Add xfce4-screensaver-command -l to xflock4 script for it to work properly."
LICENSE = "GPL-2.0-only"

PV = "4.18.2"

RPM_NAME = "xfce4-screensaver-4.18.2-1.1.aarch64.rpm"
RPM_HASH = "5f6e8b631eb7b3b3bddb715a7ec3cc60ce214e20e496ba05f56a190b6798fa32434f4b0395442c818de3be5540e6902336c25867a97f0f905066c502181f66dd"

RPROVIDES:${PN} += "config-xfce4-screensaver \
xfce4-screensaver"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libXext.so.6 \
libXss.so.1 \
libc.so.6 \
libcairo.so.2 \
libdbus-1.so.3 \
libdbus-glib-1.so.2 \
libgarcon-1.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpam.so.0 \
libpango-1.0.so.0 \
libsystemd.so.0 \
libwnck-3.so.0 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
libxfconf-0.so.3 \
libxklavier.so.16 \
xfconf"

inherit rpm
