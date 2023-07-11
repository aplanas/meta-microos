SUMMARY = "User-mode driver and GTK3-based GUI for the Steam Controller"
DESCRIPTION = "Application allowing to setup, configure and use the Steam Controller \
without using the Steam client."
LICENSE = "GPL-2.0-only"

PV = "0.4.8.11"

RPM_NAME = "sc-controller-0.4.8.11-1.2.aarch64.rpm"
RPM_HASH = "358096b3fe313ecb58c5629109a6e27af31c59eb90c734163e272b9864829fae9e03900d01a4474f0613974e19563f02402da62f1bb9848a6a276b0986336333"

RPROVIDES:${PN} += "libcemuhook.cpython-311-aarch64-linux-gnu.so \
libhiddrv.cpython-311-aarch64-linux-gnu.so \
libremotepad.cpython-311-aarch64-linux-gnu.so \
libsc-by-bt.cpython-311-aarch64-linux-gnu.so \
libuinput.cpython-311-aarch64-linux-gnu.so \
python3.11dist-sccontroller \
python3dist-sccontroller \
sc-controller"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
python-abi \
python3-evdev \
python3-gobject-Gdk \
python3-pycairo \
python3-pylibacl \
python3-setuptools \
typelib-AppIndicator3 \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-GdkX11 \
typelib-Gio \
typelib-Gtk \
typelib-GtkLayerShell \
typelib-Pango \
typelib-Rsvg \
typelib-cairo"

inherit rpm
