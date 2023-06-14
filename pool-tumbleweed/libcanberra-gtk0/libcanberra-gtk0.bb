SUMMARY = "Portable sound event library -- GTK+ 2 Library"
DESCRIPTION = "libcanberra is an implementation of the XDG Sound Theme and Name \
Specifications, for generating event sounds on free desktops, such \
as GNOME. It comes with several backends (ALSA, PulseAudio, null) \
and is designed to be portable. \
 \
This package contains a library to make it easier to use \
libcanberra from GTK+ 2 applications."
LICENSE = "LGPL-2.0-or-later"

PV = "0.30"

RPM_NAME = "libcanberra-gtk0-0.30-15.23.aarch64.rpm"
RPM_HASH = "296100ed83aef745e28e80a7ae6dfa350af0b9e0253e19dfe72fdadda5216327f004d87ddb9575c29c6da2b68978e6a69b7faf6ac7db4fe746345e343b15862d"

RPROVIDES:${PN} += "libcanberra-gtk.so.0 \
libcanberra-gtk0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcanberra.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
