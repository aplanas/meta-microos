SUMMARY = "D-Bus Service for Zeroconf and Bonjour"
DESCRIPTION = "Avahi is an implementation of the DNS Service Discovery and Multicast \
DNS specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "libavahi-common3-0.8-23.3.aarch64.rpm"
RPM_HASH = "84b10a5f7565425d36ab88bec484608553a531546792a549a92e9be567b2352496eff9432068ebc8d12787b28d74e1503b1ba5be4b6defce554551427ebce10a"

RPROVIDES:${PN} += "libavahi-common.so.3 \
libavahi-common3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
