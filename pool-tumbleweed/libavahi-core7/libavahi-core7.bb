SUMMARY = "D-Bus Service for Zeroconf and Bonjour"
DESCRIPTION = "Avahi is an implementation of the DNS Service Discovery and Multicast \
DNS specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "libavahi-core7-0.8-23.1.aarch64.rpm"
RPM_HASH = "4dbf4a3136ae046a0846ccc6b8540ce80dfb92602e392dca5e132f0d2c4ee36a51b4947dd596a978c90052e8547ef5b7c9fbda86db2d0fde3642fec7427705fd"

RPROVIDES:${PN} += "libavahi-core.so.7()(64bit) \
libavahi-core7 \
libavahi-core7(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libavahi-common.so.3()(64bit) \
libc.so.6()(64bit)"

inherit rpm
