SUMMARY = "Hex Editor"
DESCRIPTION = "Okteta is a hex editor for the raw data of files."
LICENSE = "GFDL-1.2-only & GPL-2.0-only"

PV = "0.26.13"

RPM_NAME = "okteta-0.26.13-1.1.aarch64.rpm"
RPM_HASH = "6de26f73d6e73374604a66a5ade1070b66af801228295ca66027f0d21eae7d3861980a58353dd6ab39bf59e0cf3c561c5a714231d23d653ef7e76a6b84118485"

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
