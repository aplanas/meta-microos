SUMMARY = "Telepathy filetransfer handler"
DESCRIPTION = "Telepathy text filetransfer handler"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "ktp-filetransfer-handler-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "0af1539f822107685c1a7e26310b9a4aa548a912be313e20339fab5dee900f9b793ec1cf669bf1272b8d6cb57730c012fffb237373854c7fccee890d1d178a4a"

RPROVIDES:${PN} += "ktp-filetransfer-handler \
ktp-filetransfer-handler5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5KIOWidgets.so.5 \
libKTpCommonInternals.so.9 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6 \
libtelepathy-qt5.so.0"

inherit rpm
