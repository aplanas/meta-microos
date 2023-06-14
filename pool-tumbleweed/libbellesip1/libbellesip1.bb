SUMMARY = "C object-oriented SIP Stack"
DESCRIPTION = "Belle-sip is a SIP (RFC3261) implementation written in C, with an \
object-oriented API."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.49"

RPM_NAME = "libbellesip1-5.2.49-1.1.aarch64.rpm"
RPM_HASH = "76db314c303aef86249590c7659c771cb2ca46f29f5b5b00760cc6a3e659b41f9abd63a01ae8343b7b0a3fb5366e46605429390e547cc522fcd37f2b113b9095"

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
