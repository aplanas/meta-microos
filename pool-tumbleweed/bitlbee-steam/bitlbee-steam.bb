SUMMARY = "Steam protocol plugin for BitlBee"
DESCRIPTION = "Steam protocol plugin for BitlBee"
LICENSE = "GPL-2.0"

PV = "1.4.2"

RPM_NAME = "bitlbee-steam-1.4.2-1.28.aarch64.rpm"
RPM_HASH = "0f6955b2a327de0a03ac04dc83d88902f22d40d8b53bf000568c2fe8a35c483577bdd821cfa82c36b2ef918ebdc442173f21086d79560214cc44871192063996"

RPROVIDES:${PN} += "bitlbee-steam"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libglib-2.0.so.0"

inherit rpm
