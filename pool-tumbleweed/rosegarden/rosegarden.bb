SUMMARY = "Midi, Audio And Notation Editor"
DESCRIPTION = "Rosegarden is a well-rounded audio and MIDI sequencer, \
score editor, and general-purpose music composition and \
editing environment. Rosegarden is an easy-to-learn, \
attractive application that runs on Linux, ideal for \
composers, musicians, music students, and small studio or \
home recording environments."
LICENSE = "GPL-2.0-or-later"

PV = "22.12.1"

RPM_NAME = "rosegarden-22.12.1-2.2.aarch64.rpm"
RPM_HASH = "b4d7f7c9abde66a180125dac81b5c9a28129bf4afd3717d0439c5837cc02eeccfa5b39e1308dd94377489d5e304fea35f9e027ee2fe0e59fdecc33953192c803"

RPROVIDES:${PN} += "librosegardenprivate.so \
rosegarden"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/python3 \
/usr/bin/ruby \
/usr/bin/sh \
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
