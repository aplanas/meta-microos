SUMMARY = "Zeroconf Support for KIO applications"
DESCRIPTION = "This package adds Zeroconf support to KIO, allowing the use of this protocol \
in all applications that are using KIO."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kdnssd-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "98a45569d1bd7495bd5e24b9247806b6e0c49f8c96c7ba925948c1da53fc95d58be0897f90aaadc01aa888c553e9741de91641ed3721b2dbb07eb28e99f6aee0"

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
