SUMMARY = "DNSSEC support functions for Knot DNS"
DESCRIPTION = "Knot DNS is a DNS server. It implements only the authoritative domain \
name service. It uses a multi-threaded and mostly lock-free \
implementation and can operate non-stop during zone addition or \
removal. \
 \
This package contains a library for DNSSEC support functions."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.9"

RPM_NAME = "libdnssec9-3.2.9-1.1.aarch64.rpm"
RPM_HASH = "3ef866cba7ff412925bb128305cba24edb9386d1f4cbe950f097371ff55e909a750da063a624f6763f4eb9c6326242943cd6caab7c2dc2187b1e1ef6fc81d8c1"

RPROVIDES:${PN} += "libdnssec.so.9 \
libdnssec9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30"

inherit rpm
