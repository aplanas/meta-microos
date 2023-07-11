SUMMARY = "GNOME Bluetooth graphical utilities"
DESCRIPTION = "A set of graphical utilities to setup, monitor and use Bluetooth devices. \
 \
This package provides the utilities, data files and manuals for GNOME Bluetooth."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.34.5"

RPM_NAME = "gnome-bluetooth-1-3.34.5-2.8.aarch64.rpm"
RPM_HASH = "753da20e3ffb97ae2f802e31e747ca1323120a058aa1c5650730edadb9409878ef1cd6a36b0eea8573037dedfd57dcf626f47026ef082046ad343ba6fce36ee7"

RPROVIDES:${PN} += "gnome-bluetooth \
gnome-bluetooth-1"

RDEPENDS:${PN} += "bluez \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-bluetooth.so.13 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
