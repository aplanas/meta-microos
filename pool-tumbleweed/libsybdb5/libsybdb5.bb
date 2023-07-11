SUMMARY = "FreeTDS standalone driver with classic API"
DESCRIPTION = "db-lib is the oldest and simplest API, and the only API supported by \
both vendors, which has some relevance when porting applications that \
use the vendors' libraries. db-lib was the first API implemented by \
FreeTDS, and is still the best one supported. Anything that can be \
done in FreeTDS can be done through db-lib."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.18"

RPM_NAME = "libsybdb5-1.3.18-1.1.aarch64.rpm"
RPM_HASH = "889d314a5b0405c3ff1716fbd57333837d37b213efb35affdce6e705dbaa8cd49345799487cc95549e8a044ddbdf6bfcd53bffb2b6165cfa55d3fa363eb7d924"

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
