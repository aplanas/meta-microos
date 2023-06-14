SUMMARY = "Zeroconf Support for KIO applications"
DESCRIPTION = "This package adds Zeroconf support to KIO, allowing the use of this protocol \
in all applications that are using KIO."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kdnssd-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "4da512239b80c100021239963d92da964115469fbaac7c86a46600ece142142f6dfcb4b8881b0bc6f4d0a554ee9e5ed31ab11de1f6eb1c8c319e985172e31434"

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
