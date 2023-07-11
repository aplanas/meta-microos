SUMMARY = "Osmocom GSUP (General Subscriber Update Protocol) client library"
DESCRIPTION = "This is a shared library that can be used to implement client programs for \
the GSUP protocol. The typical GSUP server is OsmoHLR, with OsmoMSC, OsmoSGSN \
and External USSD Entities (EUSEs) using this library to implement clients."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "libosmo-gsup-client0-1.4.0-1.12.aarch64.rpm"
RPM_HASH = "1625f81767fce2f54818c0182e6f20ef215d1e942946a971fe31024e5230091e07e6fad1a4a0b71bf3a7cdf22b9b4647af60eef43164205fc87f6cba0e02a5bd"

RPROVIDES:${PN} += "libosmo-gsup-client.so.0 \
libosmo-gsup-client0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmoabis.so.10 \
libosmocore.so.20 \
libtalloc.so.2"

inherit rpm
