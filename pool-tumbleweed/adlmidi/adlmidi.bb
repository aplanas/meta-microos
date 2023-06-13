SUMMARY = "A MIDI player that uses OPL3 emulation"
DESCRIPTION = "AdlMIDI is a commandline program that plays MIDI files using software \
OPL3 emulation (FM synthesis)."
LICENSE = "GPL-3.0-only & GPL-2.0-or-later"

PV = "1.2.6.2"

RPM_NAME = "adlmidi-1.2.6.2-3.11.aarch64.rpm"
RPM_HASH = "098957248c25a80a0770bb6ca935a2ea3f41822c7ab3a0f729cafc9e7d3e8fbf1e9df5089674c5faa7c47a0a55880d84c1e32fe51e86ac2f2dc7e8e21012da55"

RPROVIDES:${PN} += "adlmidi \
adlmidi(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libSDL2-2.0.so.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgomp.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
