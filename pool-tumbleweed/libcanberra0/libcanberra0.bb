SUMMARY = "Portable sound event library"
DESCRIPTION = "libcanberra is an implementation of the XDG Sound Theme and Name \
Specifications, for generating event sounds on free desktops, such \
as GNOME. It comes with several backends (ALSA, PulseAudio, null) \
and is designed to be portable. \
 \
This package contains the main library."
LICENSE = "LGPL-2.0-or-later"

PV = "0.30"

RPM_NAME = "libcanberra0-0.30-15.23.aarch64.rpm"
RPM_HASH = "672ce81bc88a92f61bddcbdf0f9edaaa74300d8d527892117d50bfa1b18194f1744a7ce62624e10a69a290f3514f266a8f02a1378d2e141254335464b1901ce2"

RPROVIDES:${PN} += "libcanberra-alsa.so \
libcanberra-multi.so \
libcanberra-null.so \
libcanberra-oss.so \
libcanberra-pulse.so \
libcanberra.so.0 \
libcanberra0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libltdl.so.7 \
libpulse.so.0 \
libpulse0 \
libvorbisfile.so.3"

inherit rpm
