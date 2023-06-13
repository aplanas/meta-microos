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

PV = "1.2.0"

RPM_NAME = "hydrogen-1.2.0-1.1.aarch64.rpm"
RPM_HASH = "1cbf6af82da64898e163ed74ebefaa3cc23177c4940605d269b3bb94ef986fc9fec19403e518be039c2a5c81eb5b0636715aee22c63bb86ff28e5ffc228f4bbb"

RPROVIDES:${PN} += "application() \
application(org.hydrogenmusic.Hydrogen.desktop) \
hydrogen \
hydrogen(aarch-64) \
metainfo() \
metainfo(org.hydrogenmusic.Hydrogen.appdata.xml) \
mimehandler(text/xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libhydrogen-core-1.2.0.so()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.1)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
rubberband-cli"

inherit rpm
