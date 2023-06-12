SUMMARY = "DNSSEC support functions for Knot DNS"
DESCRIPTION = "Knot DNS is a DNS server. It implements only the authoritative domain \
name service. It uses a multi-threaded and mostly lock-free \
implementation and can operate non-stop during zone addition or \
removal. \
 \
This package contains a library for DNSSEC support functions."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.6"

RPM_NAME = "libdnssec9-3.2.6-1.1.aarch64.rpm"
RPM_HASH = "1a929d02984dfc554292f9d2ce9cded473b863314da2a861342d698d75fe41eb657fcb2f388109c391d68f665bafc71079a45d47ed05e4dd11b32b0ddbac494f"

RPROVIDES:${PN} += "libdnssec.so.9()(64bit) \
libdnssec9 \
libdnssec9(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libgnutls.so.30(GNUTLS_3_6_0)(64bit)"

inherit rpm
