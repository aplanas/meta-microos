SUMMARY = "A WYSIWYG music score typesetter"
DESCRIPTION = "MuseScore is a graphical music typesetter. It allows for note entry on a \
virtual note sheet. It has an integrated sequencer for immediate playing of the \
score. MuseScore can import and export MusicXml and standard MIDI files. \
 \
Regarding Muse-Hub and VSTs, you should really read: \
/usr/share/doc/packages/musescore/README.SUSE."
LICENSE = "Apache-2.0 & BSD-3-Clause & FTL & GPL-2.0-only & SUSE-GPL-3.0-with-font-exception & GPL-2.0-or-later & GFDL-1.2-only & LGPL-2.0-only & LGPL-2.1-only & (GPL-2.0-only | GPL-3.0-only) & MIT"

PV = "4.0.2"

RPM_NAME = "musescore-4.0.2-2.3.aarch64.rpm"
RPM_HASH = "dbff19ce04a8f9b563ee2600ff23f4b03c1cd4a8abce2e894fe77b3b3b0976cde81ce6bdbfe3513f8fb51b0aba1777bc8ad1b67ef250ae5b844c3c63982bd90e"

RPROVIDES:${PN} += "musescore"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5NetworkAuth.so.5 \
libQt5PrintSupport.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickWidgets.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libQt5XmlPatterns.so.5 \
libasound.so.2 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libqt5-qtgraphicaleffects \
libqt5-qtquickcontrols2 \
libsndfile.so.1 \
libstdc++.so.6 \
libz.so.1 \
musescore-fonts \
qt5qmlimport-Qt.labs.settings.1 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.1 \
qt5qmlimport-QtQuick.Controls.Styles.1 \
qt5qmlimport-QtQuick.Dialogs.1 \
qt5qmlimport-QtQuick.Layouts.1"

inherit rpm
