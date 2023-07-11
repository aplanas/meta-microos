SUMMARY = "D-Bus Service for Zeroconf and Bonjour"
DESCRIPTION = "Avahi is an implementation of the DNS Service Discovery and Multicast \
DNS specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "libavahi-core7-0.8-23.3.aarch64.rpm"
RPM_HASH = "45e6f7bda3bbfaeb66cace3c28601f0428fb3457c8fdf51edc39768d6c899fabd738b8ab19c097de0ed9c4aadf6777606cb12c04bf1205e176c1fd573b9c1512"

RPROVIDES:${PN} += "libavahi-core.so.7 \
libavahi-core7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavahi-common.so.3 \
libc.so.6"

inherit rpm
