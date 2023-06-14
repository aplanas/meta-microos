SUMMARY = "Samplerate Plug-In for ALSA Library"
DESCRIPTION = "This package contains the sample rate converter plugin for ALSA \
library using libsamplerate."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.7.1"

RPM_NAME = "alsa-plugins-samplerate-1.2.7.1-4.5.aarch64.rpm"
RPM_HASH = "4a0b1e50ceed365a3cf23182adbbf3cabc031d4b9c1088e9518cac11fa1666402dc43e60cf5488f91b01d948955982ae5f24deaa621e487ccfc03bffe855f268"

RPROVIDES:${PN} += "alsa-plugins-samplerate \
libasound-module-rate-samplerate.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libsamplerate.so.0"

inherit rpm
