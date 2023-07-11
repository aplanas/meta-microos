SUMMARY = "A MIDI player that uses OPL3 emulation"
DESCRIPTION = "AdlMIDI is a commandline program that plays MIDI files using software \
OPL3 emulation (FM synthesis)."
LICENSE = "GPL-3.0-only & GPL-2.0-or-later"

PV = "1.2.6.2"

RPM_NAME = "adlmidi-1.2.6.2-3.12.aarch64.rpm"
RPM_HASH = "f1910368bd6703c606390c09167b1eb88b8845e33aae097d7944f85c69e73b1b3411d65399ad4961d273f67d5c8157ee502e82784ebe3cef4fb7ebfa266a8e76"

RPROVIDES:${PN} += "adlmidi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
