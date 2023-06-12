SUMMARY = "The settings Daemon for the Cinnamon Desktop"
DESCRIPTION = "This package contains the settings Daemon for the Cinnamon Desktop."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only"

PV = "5.2.0"

RPM_NAME = "cinnamon-settings-daemon-5.2.0-2.7.aarch64.rpm"
RPM_HASH = "62614e2a66d082d21ca2d61e310b36f84b807cd34a892dd1bd56128d2082de3ffb7fbec259c8e8a42a1b721d8d2f50b6b01d8dc9cd540795def90e3cd2b0643c"

RPROVIDES:${PN} += "application() \
application(csd-automount.desktop) \
cinnamon-settings-daemon \
cinnamon-settings-daemon(aarch-64) \
config(cinnamon-settings-daemon) \
libcsd.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libXfixes.so.3()(64bit) \
libXi.so.6()(64bit) \
libXtst.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libcanberra-gtk3.so.0()(64bit) \
libcanberra.so.0()(64bit) \
libcinnamon-desktop.so.4()(64bit) \
libcolord.so.2()(64bit) \
libcups.so.2()(64bit) \
libcvc.so.0()(64bit) \
libdbus-glib-1.so.2()(64bit) \
libfontconfig.so.1()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgnomekbd.so.8()(64bit) \
libgnomekbdui.so.8()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgudev-1.0.so.0()(64bit) \
liblcms2.so.2()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libnotify.so.4()(64bit) \
libnspr4.so()(64bit) \
libnss3.so()(64bit) \
libnss3.so(NSS_3.2)(64bit) \
libnss3.so(NSS_3.3)(64bit) \
libnss3.so(NSS_3.4)(64bit) \
libnss3.so(NSS_3.9.3)(64bit) \
libpango-1.0.so.0()(64bit) \
libplc4.so()(64bit) \
libpolkit-gobject-1.so.0()(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
librsvg-2.so.2()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libupower-glib.so.3()(64bit) \
libwacom.so.9()(64bit) \
libwacom.so.9(LIBWACOM_2.0)(64bit) \
libxklavier.so.16()(64bit)"

inherit rpm
