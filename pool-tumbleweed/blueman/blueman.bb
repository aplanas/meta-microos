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

RPM_NAME = "blueman-2.3.5-1.4.aarch64.rpm"
RPM_HASH = "682eb94d3991d60ae6646ac8cf3a88775097924ec5cbb4a45243d7aae89732d9c761d86a9ec1150ca5c74ca40d4849943452aa3dccc807341db85a815af604af"

RPROVIDES:${PN} += "blueman"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
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
