SUMMARY = "Client interface to PulseAudio"
DESCRIPTION = "pulseaudio is a networked sound server for Linux and other Unix like \
operating systems and Microsoft Windows. It is intended to be an \
improved drop-in replacement for the Enlightened Sound Daemon (ESOUND). \
 \
This package contains the system libraries for clients of pulseaudio \
sound server."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "16.1"

RPM_NAME = "libpulse0-16.1-3.1.aarch64.rpm"
RPM_HASH = "8a5154ab3ab2bcba9a070f8a543d04a46d0ece3ce3fe85b9b13ef2d0fb3927a343de6e2e656b514ca77d1a4af01d15b0cf26aa4ef02cffcdde01b935d82e6ca7"

RPROVIDES:${PN} += "config-libpulse0 \
libpulse-simple.so.0 \
libpulse.so.0 \
libpulse0 \
libpulsecommon-16.1.so \
pulseaudio-libs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libm.so.6 \
libsndfile.so.1 \
libsystemd.so.0 \
libxcb.so.1"

inherit rpm
