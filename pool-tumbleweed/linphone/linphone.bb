SUMMARY = "Web Phone"
DESCRIPTION = "Linphone is a Web phone with a Qt interface. It lets you make \
two-party calls over IP networks such as the Internet. It uses the IETF \
protocols SIP (Session Initiation Protocol) and RTP (Realtime TransporT \
Protocol) to make calls, so it should be able to communicate with other \
SIP-based Web phones. With several codecs available, it can be used \
with high speed connections as well as 28k modems."
LICENSE = "GPL-3.0-or-later"

PV = "5.0.16"

RPM_NAME = "linphone-5.0.16-1.1.aarch64.rpm"
RPM_HASH = "f02a0ec8aecdd6003b71ee2c64faf253328a316ef90003bc153fbaefed5b9c423e7b9b09fb19dc905f3ceb7327d8a6b765774b70107e73393ba5ca44b678a020"

RPROVIDES:${PN} += "application() \
application(linphone.desktop) \
libapp-plugin.so()(64bit) \
linphone \
linphone(aarch-64) \
metainfo() \
metainfo(org.linphone.appdata.xml) \
mimehandler(x-scheme-handler/callto) \
mimehandler(x-scheme-handler/linphone-config) \
mimehandler(x-scheme-handler/sip) \
mimehandler(x-scheme-handler/sip-linphone) \
mimehandler(x-scheme-handler/sips) \
mimehandler(x-scheme-handler/sips-linphone) \
mimehandler(x-scheme-handler/tel)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5QuickControls2.so.5()(64bit) \
libQt5QuickControls2.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5TextToSpeech.so.5()(64bit) \
libQt5TextToSpeech.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libbctoolbox.so.1()(64bit) \
libbelcard.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
liblinphone++.so.10()(64bit) \
liblinphone-data \
liblinphone.so.10()(64bit) \
libm.so.6()(64bit) \
libmediastreamer.so.11()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
