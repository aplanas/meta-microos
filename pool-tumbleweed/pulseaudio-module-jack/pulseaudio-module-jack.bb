SUMMARY = "JACK support for the PulseAudio sound server"
DESCRIPTION = "pulseaudio is a networked sound server for Linux and other Unix like \
operating systems and Microsoft Windows. It is intended to be an \
improved drop-in replacement for the Enlightened Sound Daemon (ESOUND). \
 \
This package includes support for Jack-based applications."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "16.1"

RPM_NAME = "pulseaudio-module-jack-16.1-4.1.aarch64.rpm"
RPM_HASH = "34093e6cb5d1743592ac3f8f46748d0a704d9e37913648bb19a9b15f2f318e9ce208f60a1df5c312ab81a928c61f9cd304f651ddad24fb61d9c796953ab4f242"

RPROVIDES:${PN} += "pulseaudio-module-jack"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libjack.so.0 \
libpulsecommon-16.1.so \
libpulsecore-16.1.so \
pulseaudio"

inherit rpm
