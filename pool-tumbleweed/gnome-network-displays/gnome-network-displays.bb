SUMMARY = "Miracast implementation for GNOME"
DESCRIPTION = "This is an experimental implementation of Wi-Fi Display (aka Miracast). \
The application will stream the selected monitor if the mutter screencast \
portal is available. If it is unavailable, a fallback to X11 based frame \
grabbing will happen. As such, it should work fine in almost all setups. \
To get audio streaming, you need to change the audio output in pulseaudio \
to use the created 'Network-Displays' sink."
LICENSE = "GPL-3.0-only"

PV = "0.90.5"

RPM_NAME = "gnome-network-displays-0.90.5-1.7.aarch64.rpm"
RPM_HASH = "5fbb01c07338c7c6685ed83089674b632a19f306601d81dc5c19a98a4636989360ac45a25f760dabee0a254f876d9269cce5abb3fecd4cefc01c0b866f9592b2"

RPROVIDES:${PN} += "application() \
application(org.gnome.NetworkDisplays.desktop) \
gnome-network-displays \
gnome-network-displays(aarch-64) \
metainfo() \
metainfo(org.gnome.NetworkDisplays.appdata.xml)"

RDEPENDS:${PN} += "gstreamer-plugin-pipewire \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstbase-1.0.so.0()(64bit) \
libgstpbutils-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgstrtsp-1.0.so.0()(64bit) \
libgstrtspserver-1.0.so.0()(64bit) \
libgstvideo-1.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libnm.so.0()(64bit) \
libnm.so.0(libnm_1_0_0)(64bit) \
libnm.so.0(libnm_1_16_0)(64bit) \
libpulse-mainloop-glib.so.0()(64bit) \
libpulse-mainloop-glib.so.0(PULSE_0)(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit)"

inherit rpm
