SUMMARY = "WildMidi Midi Wavetable Synth Lib"
DESCRIPTION = "This package contains the WildMidi core softsynth library. The library is \
designed to process a midi file and stream out the stereo audio data \
through a buffer which an external program can then process further."
LICENSE = "LGPL-3.0-or-later"

PV = "0.4.5"

RPM_NAME = "libWildMidi2-0.4.5-1.4.aarch64.rpm"
RPM_HASH = "ae373bc37c2bc04060b61572da685f8e46b0a79476cd843588f586a4734bef596155de732393a8eec6983ebbb87d01e415233abf6fc099a3406fe8973f2de57e"

RPROVIDES:${PN} += "config-libWildMidi2 \
libWildMidi.so.2 \
libWildMidi2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
timidity"

inherit rpm
