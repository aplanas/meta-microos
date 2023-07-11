SUMMARY = "Library essential for the hydrogen drum machine software"
DESCRIPTION = "Hydrogen is a software synthesizer which can be used alone, emulating \
a drum machine based on patterns, or via an external MIDI \
keyboard/sequencer software. \
 \
This library is the core of hydrogen's operation."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.1"

RPM_NAME = "libhydrogen-core-1_2_1-1.2.1-1.1.aarch64.rpm"
RPM_HASH = "5affa75f6bffdd69b32b5260fe6583c28dd1fe32a08f1d004224336cac9ce8c2eef55314942be7276a5a430b44c207b07c84a04b5ce810c662a889b59021b736"

RPROVIDES:${PN} += "libhydrogen-core-1-2-1 \
libhydrogen-core-1.2.1.so"

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
