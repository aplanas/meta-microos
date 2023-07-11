SUMMARY = "FreeTDS standalone driver with modern API"
DESCRIPTION = "ct-lib refers to Sybase's second-generation API, which fixes a number \
of implementation and conceptual gaps in db-lib (libsybdb). libct is \
not the most complete implementation yet."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.18"

RPM_NAME = "libct4-1.3.18-1.1.aarch64.rpm"
RPM_HASH = "1d12923013d0af5428ee98dbc86815445b285e0e4926d1c52f8295ec717d0a50b672d7bd9473fe3657a476f5e5a6e856b713122995e776d5bd96a8bf5a14744c"

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
