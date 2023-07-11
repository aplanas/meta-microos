SUMMARY = "A MIDI player with OPL3 emulation"
DESCRIPTION = "AdlMIDI is a commandline program that plays MIDI files using software \
OPL3 emulation (FM synthesis)."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "1.5.1"

RPM_NAME = "adlmidi-tools-1.5.1-1.4.aarch64.rpm"
RPM_HASH = "ac2232ce670373272b7102ea24a113030a6564547804e9acef051900131b464792d53fdd3d71b2c3cd8c7bc13d5df1bfd0f56aec0e3afebc0a83f37ad7b00e6c"

RPROVIDES:${PN} += "adlmidi-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libADLMIDI.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
