SUMMARY = "Screensaver and locker for Xfce"
DESCRIPTION = "xfce4-screensaver is a screen saver and locker that integrates with the Xfce desktop. \
This software is not ready for production machines yet. Please use with caution. \
 \
Add xfce4-screensaver-command -l to xflock4 script for it to work properly."
LICENSE = "GPL-2.0-only"

PV = "4.18.2"

RPM_NAME = "xfce4-screensaver-4.18.2-1.1.aarch64.rpm"
RPM_HASH = "5f6e8b631eb7b3b3bddb715a7ec3cc60ce214e20e496ba05f56a190b6798fa32434f4b0395442c818de3be5540e6902336c25867a97f0f905066c502181f66dd"

RPROVIDES:${PN} += "application() \
application(xfce-floaters.desktop) \
application(xfce-personal-slideshow.desktop) \
application(xfce-popsquares.desktop) \
application(xfce4-screensaver-preferences.desktop) \
config(xfce4-screensaver) \
xfce4-screensaver \
xfce4-screensaver(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGL.so.1()(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libXss.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libdbus-glib-1.so.2()(64bit) \
libgarcon-1.so.0()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpam.so.0()(64bit) \
libpam.so.0(LIBPAM_1.0)(64bit) \
libpango-1.0.so.0()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libwnck-3.so.0()(64bit) \
libxfce4ui-2.so.0()(64bit) \
libxfce4util.so.7()(64bit) \
libxfconf-0.so.3()(64bit) \
libxklavier.so.16()(64bit) \
xfconf"

inherit rpm
