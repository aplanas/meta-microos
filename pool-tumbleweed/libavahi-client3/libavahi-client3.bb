SUMMARY = "D-Bus Service for Zeroconf and Bonjour"
DESCRIPTION = "Avahi is an implementation of the DNS Service Discovery and Multicast \
DNS specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "libavahi-client3-0.8-23.3.aarch64.rpm"
RPM_HASH = "c9aa465f21db4bf48e016c30d873526b783a1f685d1a11fea3633f54f7b570041ca6cec68047e893c5907abd7d4b8b0bef018d8a73c048725fdb42503fbfd6d2"

RPROVIDES:${PN} += "libavahi-client.so.3 \
libavahi-client3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavahi-common.so.3 \
libc.so.6 \
libdbus-1.so.3"

inherit rpm
