SUMMARY = "Convenience classes for QtDBus: Build Environment"
DESCRIPTION = "KDBusAddons provides convenience classes on top of QtDBus, as well as an API to \
create KDED modules. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kdbusaddons-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "3148249a9933cb3df200387a812f5107c7bc0f95d8d52a2445a501b17b7c25c6395efd16b9608c04198d2100f1dffeb9c739c51ae240a1ee65577ca661770175"

RPROVIDES:${PN} += "cmake-KF5DBusAddons \
kdbusaddons-devel"

RDEPENDS:${PN} += "cmake-Qt5DBus \
extra-cmake-modules \
libKF5DBusAddons5"

inherit rpm
