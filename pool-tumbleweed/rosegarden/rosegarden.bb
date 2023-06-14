SUMMARY = "Midi, Audio And Notation Editor"
DESCRIPTION = "Rosegarden is a well-rounded audio and MIDI sequencer, \
score editor, and general-purpose music composition and \
editing environment. Rosegarden is an easy-to-learn, \
attractive application that runs on Linux, ideal for \
composers, musicians, music students, and small studio or \
home recording environments."
LICENSE = "GPL-2.0-or-later"

PV = "22.12.1"

RPM_NAME = "rosegarden-22.12.1-2.1.aarch64.rpm"
RPM_HASH = "7d6bd9c12edaf7dbac9fa0229ee7bced9fc3a80fb5432170ac787611598698afa009a1ec5b67e08282b9d8960a35d97d9611241969a42bf6a0b692c2d6743d10"

RPROVIDES:${PN} += "librosegardenprivate.so \
rosegarden"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/perl \
/usr/bin/python3 \
/usr/bin/ruby \
dssi \
ladspa \
ladspa-swh-plugins \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libasound.so.2 \
libc.so.6 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libjack.so.0 \
liblirc-client.so.0 \
liblo.so.7 \
liblrdf.so.2 \
libm.so.6 \
libsamplerate.so.0 \
libsndfile.so.1 \
libstdc++.so.6 \
libz.so.1 \
lilypond-fonts-common \
xsynth-dssi"

inherit rpm
