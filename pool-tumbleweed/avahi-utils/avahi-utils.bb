SUMMARY = "Command Line Utilities for the Zeroconf/Bonjour D-Bus service"
DESCRIPTION = "Avahi is an implementation of the DNS Service Discovery and Multicast \
DNS specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "avahi-utils-0.8-23.3.aarch64.rpm"
RPM_HASH = "1dd70e350774d541c86b0520ab57934b7bc721e27b52125d555b68d6d66b03d551b708e5ef96f924a63caa9daab0a03bb90605c1960e699ea4b985f884df20de"

RPROVIDES:${PN} += "avahi-utils"

RDEPENDS:${PN} += "avahi \
ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libgdbm.so.6"

inherit rpm
