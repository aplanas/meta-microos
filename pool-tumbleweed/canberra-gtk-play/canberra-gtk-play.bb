SUMMARY = "Utilities from libcanberra"
DESCRIPTION = "libcanberra is an implementation of the XDG Sound Theme and Name \
Specifications, for generating event sounds on free desktops, such \
as GNOME. It comes with several backends (ALSA, PulseAudio, null) \
and is designed to be portable. \
 \
This package provides the canberra-gtk-play utility."
LICENSE = "LGPL-2.0-or-later"

PV = "0.30"

RPM_NAME = "canberra-gtk-play-0.30-15.23.aarch64.rpm"
RPM_HASH = "e14d7e8a993db29a9fe85fb16e20e44677f5f4cf76cdc5ae830c89dfa1443b034ca4b034e4a8f129a103bdede9ef18d08d75107de66453392b6617c6f27b3731"

RPROVIDES:${PN} += "canberra-gtk-play \
libcanberra-gtk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcanberra-gtk3.so.0 \
libcanberra.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
