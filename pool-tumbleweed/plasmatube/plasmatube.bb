SUMMARY = "YouTube client"
DESCRIPTION = "PlasmaTube allows you to watch YouTube videos on your phone or desktop using a \
elegant user interface integrated with the rest of Plasma."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.3"

RPM_NAME = "plasmatube-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "409c40434ae254eb57ef1b34dd10c3054dbf7086e0469337d667beaa0cdb212e5e4a9e5d08dfafdb254714768c56e61be74af4287bf46bf0b27d0d683dd3e8f8"

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
