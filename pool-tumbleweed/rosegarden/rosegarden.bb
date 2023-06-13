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

RPROVIDES:${PN} += "application() \
application(com.rosegardenmusic.rosegarden.desktop) \
librosegardenprivate.so()(64bit) \
metainfo() \
metainfo(rosegarden.appdata.xml) \
mimehandler(audio/midi) \
mimehandler(audio/x-rosegarden-composition) \
mimehandler(audio/x-rosegarden-device) \
mimehandler(audio/x-rosegarden-project) \
mimehandler(audio/x-rosegarden-template) \
rosegarden \
rosegarden(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/perl \
/usr/bin/python3 \
/usr/bin/ruby \
dssi \
ladspa \
ladspa-swh-plugins \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libasound.so.2()(64bit) \
libc.so.6()(64bit) \
libfftw3f.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libjack.so.0()(64bit) \
liblirc_client.so.0()(64bit) \
liblo.so.7()(64bit) \
liblrdf.so.2()(64bit) \
libm.so.6()(64bit) \
libsamplerate.so.0()(64bit) \
libsndfile.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit) \
lilypond-fonts-common \
xsynth-dssi"

inherit rpm
