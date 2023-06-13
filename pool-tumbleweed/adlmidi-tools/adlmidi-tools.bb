SUMMARY = "A MIDI player with OPL3 emulation"
DESCRIPTION = "AdlMIDI is a commandline program that plays MIDI files using software \
OPL3 emulation (FM synthesis)."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "1.5.1"

RPM_NAME = "adlmidi-tools-1.5.1-1.3.aarch64.rpm"
RPM_HASH = "85f4737a6f6623682df2d19569e87b94c5301c96874493f5abf914d08e958ed0f3c2fe5eea979b8792b5a9898ffe4e48df3b0cf35f6c7c28db3f9b4f8aff2992"

RPROVIDES:${PN} += "adlmidi-tools \
adlmidi-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libADLMIDI.so.1()(64bit) \
libSDL2-2.0.so.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgomp.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
