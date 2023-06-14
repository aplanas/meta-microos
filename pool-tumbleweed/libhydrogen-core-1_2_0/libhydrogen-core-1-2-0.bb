SUMMARY = "Library essential for the hydrogen drum machine software"
DESCRIPTION = "Hydrogen is a software synthesizer which can be used alone, emulating \
a drum machine based on patterns, or via an external MIDI \
keyboard/sequencer software. \
 \
This library is the core of hydrogen's operation."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.0"

RPM_NAME = "libhydrogen-core-1_2_0-1.2.0-1.1.aarch64.rpm"
RPM_HASH = "5509cfb91c76c98ee256a70e8551dd535c52939f2c54c750161c9847e914a93b543fe479f12993da6fcc828a9e4baf6d62190959ed731c67d8a34bc5c0173c54"

RPROVIDES:${PN} += "libhydrogen-core-1-2-0 \
libhydrogen-core-1.2.0.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Xml.so.5 \
libQt5XmlPatterns.so.5 \
libarchive.so.13 \
libasound.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libjack.so.0 \
liblo.so.7 \
liblrdf.so.2 \
libm.so.6 \
libportaudio.so.2 \
libportmidi.so.2 \
libpulse.so.0 \
libsndfile.so.1 \
libstdc++.so.6"

inherit rpm
