SUMMARY = "PulseAudio system tray"
DESCRIPTION = "A replacement for the deprecated padevchooser \
 \
Pasystray allows setting the default PulseAudio source/sink and moving streams on the fly between sources/sinks without restarting the client applications."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.2"

RPM_NAME = "pasystray-0.8.2-1.3.aarch64.rpm"
RPM_HASH = "380c1ba2237048da4f1921e94025c9e8060ba5f5060a83c095bca43fb0a5fa1a8fd8ed725f054ac83d6a04f4e217bc6a1bb0c271f3f64529018941ba84b5e102"

RPROVIDES:${PN} += "application() \
application(pasystray.desktop) \
pasystray \
pasystray(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libavahi-client.so.3()(64bit) \
libavahi-common.so.3()(64bit) \
libavahi-glib.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgdk-3.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libnotify.so.4()(64bit) \
libpulse-mainloop-glib.so.0()(64bit) \
libpulse-mainloop-glib.so.0(PULSE_0)(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
pulseaudio-daemon"

inherit rpm
