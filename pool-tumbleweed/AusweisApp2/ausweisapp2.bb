SUMMARY = "Official authentication app for German ID cards and residence permits"
DESCRIPTION = "This app is developed and issued by the German government to be \
used for online authentication with electronic German ID cards \
and residence permits. To use this app, a supported RFID card \
reader or compatible NFC smart phone is required."
LICENSE = "EUPL-1.2"

PV = "1.26.4"

RPM_NAME = "AusweisApp2-1.26.4-1.3.aarch64.rpm"
RPM_HASH = "6ea61c1048e0709a38929b8416e7820d4e8275cd30f9da5c28b539332d869bb0d01573afb625c9959eac1e4aa4fe412349ef876615e8ba853ccc8211bd7bdba2"

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
