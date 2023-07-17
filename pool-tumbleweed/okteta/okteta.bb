SUMMARY = "Hex Editor"
DESCRIPTION = "Okteta is a hex editor for the raw data of files."
LICENSE = "GFDL-1.2-only & GPL-2.0-only"

PV = "0.26.12"

RPM_NAME = "okteta-0.26.12-1.1.aarch64.rpm"
RPM_HASH = "ae2d5ed4dc7b4bdfe689e200a737ac04f2918d7c4b1207f522d7e720d7a94e33157e83aa5211a083e34adfe1c246403a7cde540fefb134cf3712b29114227f60"

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
