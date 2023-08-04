SUMMARY = "Official authentication app for German ID cards and residence permits"
DESCRIPTION = "This app is developed and issued by the German government to be \
used for online authentication with electronic German ID cards \
and residence permits. To use this app, a supported RFID card \
reader or compatible NFC smart phone is required."
LICENSE = "EUPL-1.2"

PV = "1.26.7"

RPM_NAME = "AusweisApp2-1.26.7-1.1.aarch64.rpm"
RPM_HASH = "a217d63e92057c848b4f3cab22d6bd6d04d2717cd982085ebd4ebac6222dc4ce537839bf7d7432428cbeb595ac177e7be00954b9ecfc2736a627a74b0a828410"

RPROVIDES:${PN} += "AusweisApp2"

RDEPENDS:${PN} += "hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickControls2.so.6 \
libQt6StateMachine.so.6 \
libQt6Svg.so.6 \
libQt6WebSockets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libcrypto.so.3 \
libpcsclite.so.1 \
libstdc++.so.6 \
libudev.so.1"

inherit rpm
