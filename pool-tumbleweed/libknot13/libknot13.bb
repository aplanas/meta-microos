SUMMARY = "Knot DNS support library"
DESCRIPTION = "Knot DNS is a DNS server. It implements only the authoritative domain \
name service. It uses a multi-threaded and mostly lock-free \
implementation and can operate non-stop during zone addition or \
removal. \
 \
This package contains the essential core library for Knot services."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.8"

RPM_NAME = "libknot13-3.2.8-1.1.aarch64.rpm"
RPM_HASH = "a5a74df21eef7c4a412edc8e07b05ad367f7a8e06e1a6d589caae7bf7c5bf031fc7127c57b772aa72979314fb9c63339a9ce8bb7ae729a21c7e861534d96651d"

RPROVIDES:${PN} += "libknot.so.13 \
libknot13"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdnssec.so.9 \
liblmdb-0.9.30.so \
libm.so.6"

inherit rpm
