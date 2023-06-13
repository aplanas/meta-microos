SUMMARY = "Telepathy filetransfer handler"
DESCRIPTION = "Telepathy text filetransfer handler"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "ktp-filetransfer-handler-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "0af1539f822107685c1a7e26310b9a4aa548a912be313e20339fab5dee900f9b793ec1cf669bf1272b8d6cb57730c012fffb237373854c7fccee890d1d178a4a"

RPROVIDES:${PN} += "ktp-filetransfer-handler \
ktp-filetransfer-handler(aarch-64) \
ktp-filetransfer-handler5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOFileWidgets.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKTpCommonInternals.so.9()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libtelepathy-qt5.so.0()(64bit)"

inherit rpm
