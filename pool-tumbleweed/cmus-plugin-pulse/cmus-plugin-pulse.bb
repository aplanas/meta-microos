SUMMARY = "Pulseaudio output plugin for the C* Music Player"
DESCRIPTION = "This package provides PulseAudio output support for the C* Music Player."
LICENSE = "GPL-2.0-only"

PV = "2.10.0"

RPM_NAME = "cmus-plugin-pulse-2.10.0-2.1.aarch64.rpm"
RPM_HASH = "6ce26ddfe02209f13b62918421c4ff0f424856dc997f187b2c7bda39352b1e5654810966d8a1abc213eac928abf1182d90e636153de06fd72764f511344e5e35"

RPROVIDES:${PN} += "cmus-plugin-pulse"

RDEPENDS:${PN} += "cmus \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpulse.so.0"

inherit rpm
