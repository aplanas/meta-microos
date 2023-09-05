SUMMARY = "YouTube client"
DESCRIPTION = "PlasmaTube allows you to watch YouTube videos on your phone or desktop using a \
elegant user interface integrated with the rest of Plasma."
LICENSE = "GPL-3.0-or-later"

PV = "23.08.0"

RPM_NAME = "plasmatube-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "17b4207e749157fcec1641f85becb0a245170e32dc35f6c1d680adb5669b0a2978d0c635f272cddc73f2d34993bf74a84b9112fffbfb5ffbf8f8c572d539602c"

RPROVIDES:${PN} += "plasmatube"

RDEPENDS:${PN} += "kirigami2 \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickControls2.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libmpv.so.2 \
libstdc++.so.6 \
yt-dlp"

inherit rpm
