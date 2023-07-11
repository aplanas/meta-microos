SUMMARY = "A Software MIDI Synthesizer library with OPL3 (YMF262) emulator"
DESCRIPTION = "A software MIDI synthesizer library with OPL3 emulation (FM synthesis). \
The library is based on the ADLMIDI, a multiplatform MIDI player with OPL3 emulation: \
https://bisqwit.iki.fi/source/adlmidi.html"
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "1.5.1"

RPM_NAME = "libADLMIDI1-1.5.1-1.4.aarch64.rpm"
RPM_HASH = "ff98cb6b01ddd603a8170c84cee75d9e86dbb1cb1f1bbc486aad0161a180a3fb958fb07fbade83966cd6bdb36bb8aeb38784aafdad1f0768ed89f565b765d8ea"

RPROVIDES:${PN} += "libADLMIDI.so.1 \
libADLMIDI1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
