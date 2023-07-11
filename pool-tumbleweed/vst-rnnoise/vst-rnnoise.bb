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

RPM_NAME = "vst-rnnoise-1.03+git1.226f03b-1.5.aarch64.rpm"
RPM_HASH = "656fe5d0f60ae3959778fc6bd41c18afc77c3b2fc3db34e63d12c9b2c8512bfd50c943d6ecbc322caea884f3dc87258431df68917e08dfec7e34f4e0a128d7a1"

RPROVIDES:${PN} += "librnnoise-mono.so \
librnnoise-stereo.so \
vst-rnnoise"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatomic.so.1 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
