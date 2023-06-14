SUMMARY = "GTK Bluetooth Manager"
DESCRIPTION = "Blueman provides means for controlling the BlueZ API and presenting \
Bluetooth operations such as: \
 \
    * Connecting to 3G/EDGE/GPRS via dial-up \
    * Connecting to/Creating bluetooth networks \
    * Connecting to input devices \
    * Connecting to audio devices \
    * Sending/Receiving/Browsing files via OBEX \
    * Pairing \
 \
using a graphical user interface."
LICENSE = "GPL-3.0-only"

PV = "2.3.5"

RPM_NAME = "blueman-2.3.5-1.3.aarch64.rpm"
RPM_HASH = "0cdf9ecca6d933cd4027bf09b38d158413dfffe55bb30b125bc7027e570a382cbb0b7e099c251e6f5d3c090be852f8df9c9a7b550b6310d4f7beab9bfb6ded3a"

RPROVIDES:${PN} += "blueman"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
bluez \
dbus-1-python3 \
dbus-org.freedesktop.Notifications \
gdk-pixbuf-loader-rsvg \
ld-linux-aarch64.so.1 \
libbluetooth.so.3 \
libc.so.6 \
obex-data-server \
polkit \
pulseaudio-utils \
python-abi \
python3-cairo \
python3-gobject-Gdk \
python3-notify2 \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-GdkX11 \
typelib-Gio \
typelib-Gtk \
typelib-NM \
typelib-Pango"

inherit rpm
