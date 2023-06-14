SUMMARY = "A Meterbridge for the JACK Audio System"
DESCRIPTION = "Meterbridge is a JACK (JACK Audio Connection Kit) client for \
visualizing audio signals."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.3"

RPM_NAME = "meterbridge-0.9.3-1.8.aarch64.rpm"
RPM_HASH = "6f6dfb89ccaf5f14ce69d1fbff54c3db2ae17971d771d15b9429af613297d3d483a11635f3769a1306505736a8a96a11be8f68138ad0747847888f48f21ca199"

RPROVIDES:${PN} += "meterbridge"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libSDL-1.2.so.0 \
libSDL-image-1.2.so.0 \
libc.so.6 \
libjack.so.0 \
libm.so.6"

inherit rpm
