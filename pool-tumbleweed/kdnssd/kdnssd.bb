SUMMARY = "Zeroconf Support for KIO applications"
DESCRIPTION = "This package adds Zeroconf support to KIO, allowing the use of this protocol \
in all applications that are using KIO."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kdnssd-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "2e514a12969c8c9dc25bac82f7a6eb5283955162dd0eea174c40dda007f4d31fdc825b70d4bcd6e3ced228dd70e56eb3c99ab34656e91db65d269549a92b6316"

RPROVIDES:${PN} += "kdnssd"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5DNSSD.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
