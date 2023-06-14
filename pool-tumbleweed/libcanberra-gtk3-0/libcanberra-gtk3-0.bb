SUMMARY = "Portable sound event library -- GTK+ 3 Library"
DESCRIPTION = "libcanberra is an implementation of the XDG Sound Theme and Name \
Specifications, for generating event sounds on free desktops, such \
as GNOME. It comes with several backends (ALSA, PulseAudio, null) \
and is designed to be portable. \
 \
This package contains a library to make it easier to use \
libcanberra from GTK+ 3 applications."
LICENSE = "LGPL-2.0-or-later"

PV = "0.30"

RPM_NAME = "libcanberra-gtk3-0-0.30-15.23.aarch64.rpm"
RPM_HASH = "65dbe4ad11b3d56e448742c858cad179e2e68628100750bf01fca87b100817be278f3a6a1ae00785e26262899a226888ff2987b74ce7289dcde1b5800e8ac51c"

RPROVIDES:${PN} += "libcanberra-gtk3-0 \
libcanberra-gtk3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcanberra.so.0 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
