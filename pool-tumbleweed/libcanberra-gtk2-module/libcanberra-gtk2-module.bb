SUMMARY = "Portable sound event library -- GTK+ 2 Module"
DESCRIPTION = "libcanberra is an implementation of the XDG Sound Theme and Name \
Specifications, for generating event sounds on free desktops, such \
as GNOME. It comes with several backends (ALSA, PulseAudio, null) \
and is designed to be portable. \
 \
This package contains a GTK+ 2 module that triggers input feedback \
event sounds."
LICENSE = "LGPL-2.0-or-later"

PV = "0.30"

RPM_NAME = "libcanberra-gtk2-module-0.30-15.23.aarch64.rpm"
RPM_HASH = "9242cd42f2708fc78f1165b3986bcddc86214ba5a4cda45902eb6b1b4b1e5c60cad8a89c32ff2ccb57fb7434116ccf9a929c37afc2438a767136aba699d39e09"

RPROVIDES:${PN} += "libcanberra-gtk-module.so()(64bit) \
libcanberra-gtk2-module \
libcanberra-gtk2-module(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libcanberra-gtk-module-common \
libcanberra-gtk.so.0()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit)"

inherit rpm
