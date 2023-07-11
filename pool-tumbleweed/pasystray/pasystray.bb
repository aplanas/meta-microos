SUMMARY = "PulseAudio system tray"
DESCRIPTION = "A replacement for the deprecated padevchooser \
 \
Pasystray allows setting the default PulseAudio source/sink and moving streams on the fly between sources/sinks without restarting the client applications."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.2"

RPM_NAME = "pasystray-0.8.2-1.4.aarch64.rpm"
RPM_HASH = "e52a1f5dedb1ccb4af8570814df6225510a2bc3befbc00edc08a5fd4c13aa9cd88efd670246d7f179b557bb1d70aa237eec9e1f1888e2e5a5d28e588cd10fb8d"

RPROVIDES:${PN} += "pasystray"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libavahi-glib.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libnotify.so.4 \
libpulse-mainloop-glib.so.0 \
libpulse.so.0 \
pulseaudio-daemon"

inherit rpm
