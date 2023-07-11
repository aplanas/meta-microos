SUMMARY = "Hex Editor"
DESCRIPTION = "Okteta is a hex editor for the raw data of files."
LICENSE = "GFDL-1.2-only & GPL-2.0-only"

PV = "0.26.11"

RPM_NAME = "okteta-0.26.11-1.1.aarch64.rpm"
RPM_HASH = "9259c8f3cea6c05d0d19d349fbfdb06bbf1fffdcf9917ab1bf23b6a33ec38c39a47de2de0ae3b46dbe12c21990037011b6d20e6b92e1cbfd8f524ac62fe8d084"

RPROVIDES:${PN} += "okteta \
okteta5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5XmlGui.so.5 \
libKasten4Controllers.so.0 \
libKasten4Core.so.0 \
libKasten4Gui.so.0 \
libKasten4Okteta2Controllers.so.0 \
libKasten4Okteta2Core.so.0 \
libKasten4Okteta2Gui.so.0 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
