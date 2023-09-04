SUMMARY = "Knot DNS support library"
DESCRIPTION = "Knot DNS is a DNS server. It implements only the authoritative domain \
name service. It uses a multi-threaded and mostly lock-free \
implementation and can operate non-stop during zone addition or \
removal. \
 \
This package contains the essential core library for Knot services."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.9"

RPM_NAME = "libknot13-3.2.9-1.1.aarch64.rpm"
RPM_HASH = "5ce1d6c77aea96d7100009c1016e202f1b529224560bd57b549824b756cbf1d799060e0871d630cf2c77bc142f1611e4a0f5f8e3684bb76738442176580f470a"

RPROVIDES:${PN} += "libknot.so.13 \
libknot13"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdnssec.so.9 \
liblmdb-0.9.30.so \
libm.so.6"

inherit rpm
