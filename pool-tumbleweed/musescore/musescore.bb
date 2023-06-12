SUMMARY = "A WYSIWYG music score typesetter"
DESCRIPTION = "MuseScore is a graphical music typesetter. It allows for note entry on a \
virtual note sheet. It has an integrated sequencer for immediate playing of the \
score. MuseScore can import and export MusicXml and standard MIDI files. \
 \
Regarding Muse-Hub and VSTs, you should really read: \
/usr/share/doc/packages/musescore/README.SUSE."
LICENSE = "Apache-2.0 & BSD-3-Clause & FTL & GPL-2.0-only & SUSE-GPL-3.0-with-font-exception & GPL-2.0-or-later & GFDL-1.2-only & LGPL-2.0-only & LGPL-2.1-only & (GPL-2.0-only | GPL-3.0-only) & MIT"

PV = "4.0.2"

RPM_NAME = "musescore-4.0.2-2.1.aarch64.rpm"
RPM_HASH = "c29947d66de5b36757be96c087800edb800e38114a7c98fba6cf3923e5bde2ac90b5f4f62331658ff72ae7bf6f127ea7434e8e2835a4b4fc285b24773c1782b0"

RPROVIDES:${PN} += "application() \
application(org.musescore.MuseScore.desktop) \
metainfo() \
metainfo(org.musescore.MuseScore.appdata.xml) \
mimehandler(application/vnd.recordare.musicxml) \
mimehandler(application/vnd.recordare.musicxml+xml) \
mimehandler(application/x-biab) \
mimehandler(application/x-bww) \
mimehandler(application/x-capella) \
mimehandler(application/x-musedata) \
mimehandler(application/x-musescore) \
mimehandler(application/x-musescore+xml) \
mimehandler(application/x-overture) \
mimehandler(application/x-sf2) \
mimehandler(application/x-sf3) \
mimehandler(audio/midi) \
mimehandler(audio/x-gtp) \
mimehandler(audio/x-ptb) \
musescore \
musescore(aarch-64)"
RDEPENDS:${PN} += "(alsa-plugins-pulse if pulseaudio) \
(pipewire-alsa if pipewire) \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Gui.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5NetworkAuth.so.5()(64bit) \
libQt5NetworkAuth.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5QuickWidgets.so.5()(64bit) \
libQt5QuickWidgets.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libQt5XmlPatterns.so.5()(64bit) \
libQt5XmlPatterns.so.5(Qt_5)(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libasound.so.2(ALSA_0.9.0rc4)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfreetype.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libqt5-qtgraphicaleffects \
libqt5-qtquickcontrols2 \
libsndfile.so.1()(64bit) \
libsndfile.so.1(libsndfile.so.1.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.1)(64bit) \
libstdc++.so.6(CXXABI_1.3.11)(64bit) \
libstdc++.so.6(CXXABI_1.3.13)(64bit) \
libstdc++.so.6(CXXABI_1.3.2)(64bit) \
libstdc++.so.6(CXXABI_1.3.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.7)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.17)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.30)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libz.so.1()(64bit) \
musescore-fonts \
qt5qmlimport(Qt.labs.settings.1) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Controls.1) \
qt5qmlimport(QtQuick.Controls.Styles.1) \
qt5qmlimport(QtQuick.Dialogs.1) \
qt5qmlimport(QtQuick.Layouts.1)"

inherit rpm