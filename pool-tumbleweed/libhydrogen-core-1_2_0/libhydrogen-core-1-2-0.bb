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

RPROVIDES:${PN} += "libhydrogen-core-1.2.0.so()(64bit) \
libhydrogen-core-1_2_0 \
libhydrogen-core-1_2_0(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libQt5XmlPatterns.so.5()(64bit) \
libQt5XmlPatterns.so.5(Qt_5)(64bit) \
libarchive.so.13()(64bit) \
libasound.so.2()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libjack.so.0()(64bit) \
liblo.so.7()(64bit) \
liblrdf.so.2()(64bit) \
libm.so.6()(64bit) \
libportaudio.so.2()(64bit) \
libportmidi.so.2()(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libsndfile.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
