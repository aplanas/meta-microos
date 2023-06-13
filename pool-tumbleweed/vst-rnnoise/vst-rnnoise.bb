SUMMARY = "Noise suppression plugin based on Xiph's RNNoise - vst plugin"
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
This package holds the vst plugin."
LICENSE = "GPL-3.0-only"

PV = "1.03+git1.226f03b"

RPM_NAME = "vst-rnnoise-1.03+git1.226f03b-1.4.aarch64.rpm"
RPM_HASH = "4da7eb5d13ac330abedef301856bed3a945ab4b2a93b198243c9fa74970a4e50c8219f0fa64ee7277d4eb630dfa3ee2c9aac438d85f38cfc790fbf4d4ebd847c"

RPROVIDES:${PN} += "librnnoise_mono.so()(64bit) \
librnnoise_stereo.so()(64bit) \
vst-rnnoise \
vst-rnnoise(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libatomic.so.1()(64bit) \
libc.so.6()(64bit) \
libfreetype.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
