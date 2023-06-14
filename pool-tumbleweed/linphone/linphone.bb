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

RPROVIDES:${PN} += "libapp-plugin.so \
linphone"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickControls2.so.5 \
libQt5Svg.so.5 \
libQt5TextToSpeech.so.5 \
libQt5Widgets.so.5 \
libbctoolbox.so.1 \
libbelcard.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblinphone++.so.10 \
liblinphone-data \
liblinphone.so.10 \
libm.so.6 \
libmediastreamer.so.11 \
libstdc++.so.6"

inherit rpm
