SUMMARY = "Osmocom GSUP (General Subscriber Update Protocol) client library"
DESCRIPTION = "This is a shared library that can be used to implement client programs for \
the GSUP protocol. The typical GSUP server is OsmoHLR, with OsmoMSC, OsmoSGSN \
and External USSD Entities (EUSEs) using this library to implement clients."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "libosmo-gsup-client0-1.4.0-1.11.aarch64.rpm"
RPM_HASH = "933962e0b195df35c84baa296a97749335fad2e6e0f4868d62ef71796ca205f6a580e74bf27300aba670876d0dd18095bce1600b4d269ab7805ca14a4dfa6a06"

RPROVIDES:${PN} += "libosmo-gsup-client.so.0 \
libosmo-gsup-client0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmoabis.so.10 \
libosmocore.so.20 \
libtalloc.so.2"

inherit rpm
