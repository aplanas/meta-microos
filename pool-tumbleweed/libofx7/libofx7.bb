SUMMARY = "OFX Command Parser and API"
DESCRIPTION = "LibOFX is a parser and API for applications to support \
OFX command responses, usually provided by financial institutions for \
statement downloads."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.5"

RPM_NAME = "libofx7-0.10.5-1.6.aarch64.rpm"
RPM_HASH = "1b99284227d72484cfeca78f202e187af451616c3b598c94eab500c093cfc711f6cd2a40f2f003bb9d8f31466ba57a85688e84e421457aa9de64d0aa8a996621"

RPROVIDES:${PN} += "libofx.so.7 \
libofx7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libofx \
libosp.so.5 \
libstdc++.so.6"

inherit rpm
