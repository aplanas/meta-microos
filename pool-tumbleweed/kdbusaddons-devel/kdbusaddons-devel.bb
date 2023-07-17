SUMMARY = "Convenience classes for QtDBus: Build Environment"
DESCRIPTION = "KDBusAddons provides convenience classes on top of QtDBus, as well as an API to \
create KDED modules. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kdbusaddons-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "83e3bab95711fbe1586578002aebd8df7e60ae785d94accdf7fdf96a0392f4998c87518476f34fc32dd9c833d35b46d6ee8438e7989b45282e7d2f4b8a09d891"

RPROVIDES:${PN} += "cmake-KF5DBusAddons \
kdbusaddons-devel"

RDEPENDS:${PN} += "cmake-Qt5DBus \
extra-cmake-modules \
libKF5DBusAddons5"

inherit rpm
