SUMMARY = "Knot DNS support library"
DESCRIPTION = "Knot DNS is a DNS server. It implements only the authoritative domain \
name service. It uses a multi-threaded and mostly lock-free \
implementation and can operate non-stop during zone addition or \
removal. \
 \
This package contains the essential core library for Knot services."
LICENSE = "GPL-3.0-or-later"

PV = "3.3.0"

RPM_NAME = "libknot14-3.3.0-1.1.aarch64.rpm"
RPM_HASH = "9ed300fe231e67719ad2889bd8699636ab7aa004fcd58c195cac4c67e8ce03b0f694ab4e210bea52915e62f178927c7d69b8cda41517879307e830f821c66c24"

RPROVIDES:${PN} += "libknot.so.14 \
libknot14"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdnssec.so.9 \
liblmdb-0.9.30.so \
libm.so.6"

inherit rpm
