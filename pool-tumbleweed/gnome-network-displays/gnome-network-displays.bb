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

RPROVIDES:${PN} += "gnome-network-displays"

RDEPENDS:${PN} += "gstreamer-plugin-pipewire \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstbase-1.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstrtsp-1.0.so.0 \
libgstrtspserver-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgtk-3.so.0 \
libnm.so.0 \
libpulse-mainloop-glib.so.0 \
libpulse.so.0"

inherit rpm
