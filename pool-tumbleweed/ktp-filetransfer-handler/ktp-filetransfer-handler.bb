SUMMARY = "Telepathy filetransfer handler"
DESCRIPTION = "Telepathy text filetransfer handler"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "ktp-filetransfer-handler-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "275e8e3433260c1e720b3c44336cd7323367e8ca0b528b030f29461abc5b179a3b3f611ca872094476c6ea26e34925af6470cde5c88bfd9bd4780bff452c2bc0"

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
