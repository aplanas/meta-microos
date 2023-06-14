SUMMARY = "Hex Editor"
DESCRIPTION = "Okteta is a hex editor for the raw data of files."
LICENSE = "GFDL-1.2-only & GPL-2.0-only"

PV = "0.26.10"

RPM_NAME = "okteta-0.26.10-1.3.aarch64.rpm"
RPM_HASH = "a60399e36bdf81c03bef16ebe33f141c49f6f7d532b316f11495176a3f8cf66ea04b597e3dfcfb9c9a2d71ed56a125d9bb03147036c57589c7622206f6d59e53"

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
