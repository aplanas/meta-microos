SUMMARY = "Development files for libcanberra, a portable sound event library"
DESCRIPTION = "libcanberra is an implementation of the XDG Sound Theme and Name \
Specifications, for generating event sounds on free desktops, such \
as GNOME. It comes with several backends (ALSA, PulseAudio, null) \
and is designed to be portable. \
 \
This package provides the development files for libcanberra."
LICENSE = "LGPL-2.0-or-later"

PV = "0.30"

RPM_NAME = "libcanberra-devel-0.30-15.23.aarch64.rpm"
RPM_HASH = "b79d2c7eccddc9b5782328c34c0d295bb8c1c4ee356578b6782df69c31fd0165b541e1d30d7a7e8922acbfce21674e615d88325b7a7a405127e1070e27691445"

RPROVIDES:${PN} += "libcanberra-devel \
pkgconfig-libcanberra"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcanberra0"

inherit rpm
