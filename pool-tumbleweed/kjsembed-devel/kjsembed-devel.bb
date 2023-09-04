SUMMARY = "Build environment for kjsembed"
DESCRIPTION = "Development files for KSJEmbed, which provides a method of binding \
JavaScript objects to QObjects, so applications can be scripted."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kjsembed-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "c0d2f49094fd3dff5666357c56a693a02f920c3e44f0207ceab803bdec47d6e7e3a1d017e7901d9e1d7c9f658f61bfbcb4bc3f583ab32da14836b26506243f90"

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
