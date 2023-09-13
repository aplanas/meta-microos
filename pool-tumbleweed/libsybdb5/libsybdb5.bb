SUMMARY = "FreeTDS standalone driver with classic API"
DESCRIPTION = "db-lib is the oldest and simplest API, and the only API supported by \
both vendors, which has some relevance when porting applications that \
use the vendors' libraries. db-lib was the first API implemented by \
FreeTDS, and is still the best one supported. Anything that can be \
done in FreeTDS can be done through db-lib."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.20"

RPM_NAME = "libsybdb5-1.3.20-1.1.aarch64.rpm"
RPM_HASH = "2f1670e8dedcb89213e39462371428273b777f7ad3c9ed23764e1a6ed5f39f16b1d1e2b3008d2e187bbc230bc34a3a32ff5cc86413a6451056fa281de226efad"

RPROVIDES:${PN} += "libsybdb.so.5 \
libsybdb5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libgnutls.so.30 \
libgssapi-krb5.so.2 \
libhogweed.so.6 \
libnettle.so.8"

inherit rpm
