SUMMARY = "WildMidi Midi Wavetable Synth Lib"
DESCRIPTION = "This package contains the WildMidi core softsynth library. The library is \
designed to process a midi file and stream out the stereo audio data \
through a buffer which an external program can then process further."
LICENSE = "LGPL-3.0-or-later"

PV = "0.4.5"

RPM_NAME = "libWildMidi2-0.4.5-1.3.aarch64.rpm"
RPM_HASH = "32fd13d6996f58b7ddebc850b027d79567dd6cdae8aed4009f671e9e1b173e7b0571aa70d7f077a4524242482717e9a1bff1e5099032dde1cf9e7552da827ed2"

RPROVIDES:${PN} += "config(libWildMidi2) \
libWildMidi.so.2()(64bit) \
libWildMidi2 \
libWildMidi2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
timidity"

inherit rpm
