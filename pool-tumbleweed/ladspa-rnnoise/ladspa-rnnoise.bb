SUMMARY = "Noise suppression plugin based on Xiph's RNNoise - ladspa plugin"
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
This package holds the ladspa plugin."
LICENSE = "GPL-3.0-only"

PV = "1.03+git1.226f03b"

RPM_NAME = "ladspa-rnnoise-1.03+git1.226f03b-1.5.aarch64.rpm"
RPM_HASH = "7a2a2f237fcbc3d98edb79a25b6323cad9359fc47ec353fb079fa1c4745aec0055a742706914a6a5a83df40243629c814fade200b5c2a55b0401d7dd8d2e09cb"

RPROVIDES:${PN} += "ladspa-rnnoise \
librnnoise-ladspa.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatomic.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
