SUMMARY = "GTK+ 2 development files for libcanberra"
DESCRIPTION = "libcanberra is an implementation of the XDG Sound Theme and Name \
Specifications, for generating event sounds on free desktops, such \
as GNOME. It comes with several backends (ALSA, PulseAudio, null) \
and is designed to be portable. \
 \
This package provides the development files for libcanberra-gtk2."
LICENSE = "LGPL-2.0-or-later"

PV = "0.30"

RPM_NAME = "libcanberra-gtk-devel-0.30-15.23.aarch64.rpm"
RPM_HASH = "9db48661ca5ac4d8810a852821f19e0ffde7e2577d04fa69c6719fa797b97a300edc3374c8da6f496b437e794b7c6ec619ee4706ec194bf5d7602cd98f418d3f"

RPROVIDES:${PN} += "libcanberra-gtk-devel \
pkgconfig-libcanberra-gtk"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcanberra-devel \
libcanberra-gtk0 \
libcanberra0 \
pkgconfig-gdk-2.0 \
pkgconfig-gtk+-2.0 \
pkgconfig-libcanberra"

inherit rpm
