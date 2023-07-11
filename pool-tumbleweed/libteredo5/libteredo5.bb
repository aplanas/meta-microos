SUMMARY = "Teredo implementation library used by miredo"
DESCRIPTION = "Miredo is an implementation of the 'Teredo: Tunneling IPv6 over UDP \
through NATs' proposed Internet standard (RFC4380). \
This package contains a Teredo implementation."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.6"

RPM_NAME = "libteredo5-1.2.6-5.8.aarch64.rpm"
RPM_HASH = "cfa662e8348884ffa18689ad8b47c5b52e5da56f66f9131a92fbc12e9e86a9c2b0316120d00673ffd8fcff11277bf5565fb9264582a1b2f0ac387aa1effd3f48"

RPROVIDES:${PN} += "libteredo.so.5 \
libteredo5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libJudy.so.1 \
libc.so.6"

inherit rpm
