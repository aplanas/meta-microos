SUMMARY = "Build environment for kjsembed"
DESCRIPTION = "Development files for KSJEmbed, which provides a method of binding \
JavaScript objects to QObjects, so applications can be scripted."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kjsembed-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "6de4d656cd2b89b5c3201491f542e59028050ab05be3b8cff68415081f0ad060a06b96837207b24e44e042ca68ca8eabe989ca1aab6d84f374ca71b34aea5e9a"

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
