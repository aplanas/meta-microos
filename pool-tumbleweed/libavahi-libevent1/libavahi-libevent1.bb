SUMMARY = "D-Bus Service for Zeroconf and Bonjour"
DESCRIPTION = "Avahi is an implementation of the DNS Service Discovery and Multicast \
DNS specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "libavahi-libevent1-0.8-23.1.aarch64.rpm"
RPM_HASH = "144bb55a4db4f0c706540ba7c18ee97e801b196a0f85b6c6e8bd56b348359da63f4f8d7fbd99344c1f5dfc04062fdcfcfee01c3f6268875c02c85d439a84c7d8"

RPROVIDES:${PN} += "libavahi-libevent.so.1()(64bit) \
libavahi-libevent1 \
libavahi-libevent1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libavahi-common.so.3()(64bit) \
libc.so.6()(64bit) \
libevent-2.1.so.7()(64bit)"

inherit rpm
