SUMMARY = "Filesearch components for Baloo Framework"
DESCRIPTION = "Baloo is a framework for searching and managing metadata. This \
package contains filesearch components."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "5.106.0"

RPM_NAME = "baloo5-file-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "d9cb3be490e621df22656e4ddfbf53f9fcdf9e3d3370cc286d67894d71e30a9a2509bc1f5195acbdc68265ddec4c47a54f0e8cf536dfe613367b0bb080cd1826"

RPROVIDES:${PN} += "baloo-file \
baloo5-file \
baloo5-file(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libKF5Baloo.so.5()(64bit) \
libKF5BalooEngine.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5FileMetaData.so.3()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IdleTime.so.5()(64bit) \
libKF5Solid.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Sql5-sqlite \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
