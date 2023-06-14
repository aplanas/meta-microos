SUMMARY = "Knot DNS support library"
DESCRIPTION = "Knot DNS is a DNS server. It implements only the authoritative domain \
name service. It uses a multi-threaded and mostly lock-free \
implementation and can operate non-stop during zone addition or \
removal. \
 \
This package contains the essential core library for Knot services."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.6"

RPM_NAME = "libknot13-3.2.6-1.1.aarch64.rpm"
RPM_HASH = "c1d25fbae75da7078406456a4c2110e1df4e09e4bc6692cbe4280774c2410c0906e3dad1f5c60a21e3a69b0b9571e70770acd2464ca39b484400386975e7df74"

RPROVIDES:${PN} += "libknot.so.13 \
libknot13"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdnssec.so.9 \
liblmdb-0.9.30.so \
libm.so.6"

inherit rpm
