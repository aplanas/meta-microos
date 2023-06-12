SUMMARY = "MATE session settings daemon"
DESCRIPTION = "This package contains the daemon which is responsible for setting \
the various parameters of a MATE session and the applications that \
run under it."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.26.1"

RPM_NAME = "mate-settings-daemon-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "1c196a93ff22587ab882953b823a63b946f72b64a595abb4adbde93fa163897e7c1ed72238a512f6127a96fe45bcc3dd3066276dbd83932883f5cf93979422f3"

RPROVIDES:${PN} += "liba11y-keyboard.so()(64bit) \
liba11y-settings.so()(64bit) \
libbackground.so()(64bit) \
libclipboard.so()(64bit) \
libhousekeeping.so()(64bit) \
libkeybindings.so()(64bit) \
libkeyboard.so()(64bit) \
libmedia-keys.so()(64bit) \
libmouse.so()(64bit) \
libmpris.so()(64bit) \
librfkill.so()(64bit) \
libsmartcard.so()(64bit) \
libsound.so()(64bit) \
libtyping-break.so()(64bit) \
libxrandr.so()(64bit) \
libxrdb.so()(64bit) \
libxsettings.so()(64bit) \
mate-settings-daemon \
mate-settings-daemon(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXi.so.6()(64bit) \
libatspi.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libcanberra-gtk3.so.0()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libdbus-glib-1.so.2()(64bit) \
libdconf.so.1()(64bit) \
libfontconfig.so.1()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libmate-desktop-2.so.17()(64bit) \
libmatekbd.so.4()(64bit) \
libmatekbdui.so.4()(64bit) \
libmatemixer.so.0()(64bit) \
libnotify.so.4()(64bit) \
libnspr4.so()(64bit) \
libnss3.so()(64bit) \
libnss3.so(NSS_3.2)(64bit) \
libnss3.so(NSS_3.3)(64bit) \
libnss3.so(NSS_3.4)(64bit) \
libnss3.so(NSS_3.9.3)(64bit) \
libplc4.so()(64bit) \
libpolkit-gobject-1.so.0()(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libxklavier.so.16()(64bit) \
mate-backgrounds \
matekbd-common"

inherit rpm
