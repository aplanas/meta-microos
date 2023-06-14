SUMMARY = "Official authentication app for German ID cards and residence permits"
DESCRIPTION = "This app is developed and issued by the German government to be \
used for online authentication with electronic German ID cards \
and residence permits. To use this app, a supported RFID card \
reader or compatible NFC smart phone is required."
LICENSE = "EUPL-1.2"

PV = "1.26.4"

RPM_NAME = "AusweisApp2-1.26.4-1.2.aarch64.rpm"
RPM_HASH = "d3dfd1e78650628ad41e5f4369dc51c68f446882da5043e4f9eacf826b9afa445e80199b00f773a9d867f11661652b711f5faaf670fc3324578173a11ff97479"

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
