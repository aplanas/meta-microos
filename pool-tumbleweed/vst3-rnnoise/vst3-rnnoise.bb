SUMMARY = "Noise suppression plugin based on Xiph's RNNoise - vst3 plugin"
DESCRIPTION = "The plugin is meant to suppress a wide range of noise origins \
(from original paper): computer fans, office, crowd, airplane, \
car, train, construction. \
 \
From my tests mild background noise is always suppressed, \
loud sounds, like clicking of mechanical keyboard, are \
suppressed while there is no voice however they are only \
reduced in volume when voice is present. \
 \
The plugin is made to work with 1 channel and/or 2 channels \
(ladspa plugin), 16 bit, 48000 Hz audio input. \
Other sample rates may work, or not... \
 \
This package holds the vst3 plugin."
LICENSE = "GPL-3.0-only"

PV = "1.03+git1.226f03b"

RPM_NAME = "vst3-rnnoise-1.03+git1.226f03b-1.5.aarch64.rpm"
RPM_HASH = "5cd1f73382eb214adbe573029b41b63e1c905f87af6b2e12e85a3c379287db3740feaed0853f8fb5224f71955d0ffa05dc229094ba2865d12bcd50b2acad8c4c"

RPROVIDES:${PN} += "vst3-rnnoise"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatomic.so.1 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
