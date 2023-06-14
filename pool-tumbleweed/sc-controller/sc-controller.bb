SUMMARY = "User-mode driver and GTK3-based GUI for the Steam Controller"
DESCRIPTION = "Application allowing to setup, configure and use the Steam Controller \
without using the Steam client."
LICENSE = "GPL-2.0-only"

PV = "0.4.8.11"

RPM_NAME = "sc-controller-0.4.8.11-1.1.aarch64.rpm"
RPM_HASH = "8425918ecce6edf34bcd917f4be95edba2dbe3fdc849b8d6b031483e53e6313bd6a2061512002615b1341d9ce3317c2643117aba65aa3b964e67a2614080e271"

RPROVIDES:${PN} += "libcemuhook.cpython-310-aarch64-linux-gnu.so \
libhiddrv.cpython-310-aarch64-linux-gnu.so \
libremotepad.cpython-310-aarch64-linux-gnu.so \
libsc-by-bt.cpython-310-aarch64-linux-gnu.so \
libuinput.cpython-310-aarch64-linux-gnu.so \
python3.10dist-sccontroller \
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
