SUMMARY = "Samplerate Plug-In for ALSA Library"
DESCRIPTION = "This package contains the sample rate converter plugin for ALSA \
library using libsamplerate."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.7.1"

RPM_NAME = "alsa-plugins-samplerate-1.2.7.1-4.5.aarch64.rpm"
RPM_HASH = "4a0b1e50ceed365a3cf23182adbbf3cabc031d4b9c1088e9518cac11fa1666402dc43e60cf5488f91b01d948955982ae5f24deaa621e487ccfc03bffe855f268"

RPROVIDES:${PN} += "alsa-plugins-samplerate \
alsa-plugins-samplerate(aarch-64) \
libasound_module_rate_samplerate.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libasound.so.2()(64bit) \
libc.so.6()(64bit) \
libsamplerate.so.0()(64bit)"

inherit rpm
