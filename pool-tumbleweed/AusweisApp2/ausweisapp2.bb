SUMMARY = "Official authentication app for German ID cards and residence permits"
DESCRIPTION = "This app is developed and issued by the German government to be \
used for online authentication with electronic German ID cards \
and residence permits. To use this app, a supported RFID card \
reader or compatible NFC smart phone is required."
LICENSE = "EUPL-1.2"

PV = "1.26.5"

RPM_NAME = "AusweisApp2-1.26.5-1.1.aarch64.rpm"
RPM_HASH = "75a0798e099cecb2e00969b9d8295dd8bc134df7dd7a9a073ecf933e7cec4da3bd37f1ce9aa8361e6ada54bec6a1452a0ea24a98c89ebd2aa2bfe190116c1f8e"

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
