SUMMARY = "C object-oriented SIP Stack"
DESCRIPTION = "Belle-sip is a SIP (RFC3261) implementation written in C, with an \
object-oriented API."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.98"

RPM_NAME = "libbellesip1-5.2.98-1.1.aarch64.rpm"
RPM_HASH = "ebdadabb3f1e3431bb32a9072ae02d2585da70ad10ddb9b69c3e82e352d4385f43bddc53902d1a69517fef13558d934439527222832981af5801b6bf720c2b57"

RPROVIDES:${PN} += "libbellesip.so.1 \
libbellesip1"

RDEPENDS:${PN} += "/sbin/ldconfig \
belle-sip-data \
ld-linux-aarch64.so.1 \
libbctoolbox.so.1 \
libbelr.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
