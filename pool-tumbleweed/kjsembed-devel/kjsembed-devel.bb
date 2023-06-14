SUMMARY = "Build environment for kjsembed"
DESCRIPTION = "Development files for KSJEmbed, which provides a method of binding \
JavaScript objects to QObjects, so applications can be scripted."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kjsembed-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "45b89a262d5bc6eedc45452a6702f89965543d3de1d8c568c568aa40cc8cadb30a6660bdeeaf37d0461a08aaf7b5909c9c37ef02d35175741a7e643cd9fe37c9"

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
