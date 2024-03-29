SUMMARY = "A Real-Time Drum Machine and Sequencer"
DESCRIPTION = "Hydrogen is a software synthesizer which can be used alone, emulating \
a drum machine based on patterns, or via an external MIDI \
keyboard/sequencer software. \
 \
It features a modular and graphical interface based on QT5, has a \
sample-based stereo audio engine, with import of sound samples in PCM \
formats. Furthermore, a pattern-based sequencer with the ability to \
chain patterns into a song. Up to 64 ticks per pattern with \
individual level per event and variable pattern length are possible. \
32 instrument tracks with volume, mute, solo, pan capabilities are \
provided, and there is multi-layer support for instruments (up to 16 \
samples for each instrument). Human velocity, human time, pitch and \
swing functions are implemented as well."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.1"

RPM_NAME = "hydrogen-1.2.1-1.1.aarch64.rpm"
RPM_HASH = "2595473b85a5223807f3a161e20af8fbfe4600a79fcf2ec9c258ac79af11cbdb8ad3bd0f814913a0325fcb268ae149cf388d756b4ee0016d365671450b8fdbbb"

RPROVIDES:${PN} += "hydrogen"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libhydrogen-core-1.2.1.so \
libm.so.6 \
libstdc++.so.6 \
rubberband-cli"

inherit rpm
