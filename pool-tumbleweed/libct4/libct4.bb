SUMMARY = "FreeTDS standalone driver with modern API"
DESCRIPTION = "ct-lib refers to Sybase's second-generation API, which fixes a number \
of implementation and conceptual gaps in db-lib (libsybdb). libct is \
not the most complete implementation yet."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.20"

RPM_NAME = "libct4-1.3.20-1.1.aarch64.rpm"
RPM_HASH = "118a76838c01954e8914d50900ae3937ba304503e597eda55d83fb19456537fe3e2e706ec9fda53987f71c73f0d682aed8bad0d2b16ffe04307906e272fb4d8e"

RPROVIDES:${PN} += "libct.so.4 \
libct4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libgnutls.so.30 \
libgssapi-krb5.so.2 \
libhogweed.so.6 \
libnettle.so.8"

inherit rpm
