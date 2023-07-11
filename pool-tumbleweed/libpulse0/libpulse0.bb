SUMMARY = "Client interface to PulseAudio"
DESCRIPTION = "pulseaudio is a networked sound server for Linux and other Unix like \
operating systems and Microsoft Windows. It is intended to be an \
improved drop-in replacement for the Enlightened Sound Daemon (ESOUND). \
 \
This package contains the system libraries for clients of pulseaudio \
sound server."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "16.1"

RPM_NAME = "libpulse0-16.1-4.1.aarch64.rpm"
RPM_HASH = "95ab852378818d5d108f0f8f3d1077f9b08b2fc1b7d9f1c8801583522b65f2eb58e7eec41c047c3c88320b25d239cf5283119f5d3a6a2f9cd78a19321d5b5c1e"

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
