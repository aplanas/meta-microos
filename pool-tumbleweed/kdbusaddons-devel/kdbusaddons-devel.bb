SUMMARY = "Convenience classes for QtDBus: Build Environment"
DESCRIPTION = "KDBusAddons provides convenience classes on top of QtDBus, as well as an API to \
create KDED modules. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kdbusaddons-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "15253200d81240096b036b4aafc6307c1dd19f068af9fbb363a8c655abfa89490c92641029abefd07465e482a06263ecb22277155b08238d59415ae5ab900149"

RPROVIDES:${PN} += "cmake-KF5DBusAddons \
kdbusaddons-devel"

RDEPENDS:${PN} += "cmake-Qt5DBus \
extra-cmake-modules \
libKF5DBusAddons5"

inherit rpm
