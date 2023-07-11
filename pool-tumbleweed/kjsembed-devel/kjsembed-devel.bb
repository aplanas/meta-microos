SUMMARY = "Build environment for kjsembed"
DESCRIPTION = "Development files for KSJEmbed, which provides a method of binding \
JavaScript objects to QObjects, so applications can be scripted."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kjsembed-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "0473909c34a759478d9343070e5184232593d7cca3253e26a844960334d23599caee2d03a943027126b20042d92adc0d2db66997f388bf2b88c4481f208c40e2"

RPROVIDES:${PN} += "cmake-KF5JsEmbed \
kjsembed-devel"

RDEPENDS:${PN} += "cmake-KF5I18n \
cmake-KF5JS \
extra-cmake-modules \
ld-linux-aarch64.so.1 \
libKF5I18n.so.5 \
libKF5JS.so.5 \
libKF5JsEmbed.so.5 \
libKF5JsEmbed5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
