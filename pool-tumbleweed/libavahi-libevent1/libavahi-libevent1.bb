SUMMARY = "D-Bus Service for Zeroconf and Bonjour"
DESCRIPTION = "Avahi is an implementation of the DNS Service Discovery and Multicast \
DNS specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "libavahi-libevent1-0.8-23.3.aarch64.rpm"
RPM_HASH = "5db093f2c61cca4ca92d087ef285cd08976191907d81c135e2a7d2023a195cc8b1009cbfafd50e67463bb471da1f1279bbfa4950d04e7f8f951ae6892d130000"

RPROVIDES:${PN} += "libavahi-libevent.so.1 \
libavahi-libevent1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libavahi-common.so.3 \
libc.so.6 \
libevent-2.1.so.7"

inherit rpm
