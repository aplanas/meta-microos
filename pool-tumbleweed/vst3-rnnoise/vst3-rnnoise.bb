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

RPM_NAME = "vst3-rnnoise-1.03+git1.226f03b-1.4.aarch64.rpm"
RPM_HASH = "99eaf0f63e740c24b557e77eb7bd795f1d79cbfbce155ee5de7d1d09cd70107b360f1ad1d372f281546c592b02b23c7cd90c1c20c3e32f24aa0c21c9e063c117"

RPROVIDES:${PN} += "vst3-rnnoise \
vst3-rnnoise(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libatomic.so.1()(64bit) \
libc.so.6()(64bit) \
libfreetype.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
