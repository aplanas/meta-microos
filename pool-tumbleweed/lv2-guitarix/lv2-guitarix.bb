SUMMARY = "Guitarix - LV2 plugins"
DESCRIPTION = "guitarix is a simple mono amplifier to jack with one input and two \
outputs. Designed to get nice trash/metal/rock/guitar sounds. \
 \
Available are the controls for bass, treble, gain, balance, \
distortion, freeverb, impulse response (pre state), crybaby(wah), \
feedback/feedforward-filter and echo. A fixed resonator will use, \
when distortion is disabled. \
 \
This package contains the LV2 plugins."
LICENSE = "GPL-2.0-or-later"

PV = "0.44.1"

RPM_NAME = "lv2-guitarix-0.44.1-2.3.aarch64.rpm"
RPM_HASH = "fdd8d61e6f7fcb7422f25148fe13e3fa432f93e1bc6919e17bedf12f70398f4a96a9ae932ad464630543de2788f3ab0b68ce09f453eb264da841ff87fce45c4c"

RPROVIDES:${PN} += "lv2-guitarix"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libsigc-2.0.so.0 \
libsndfile.so.1 \
libstdc++.so.6 \
libzita-convolver.so.4"

inherit rpm
