SUMMARY = "FreeTDS standalone driver with modern API"
DESCRIPTION = "ct-lib refers to Sybase's second-generation API, which fixes a number \
of implementation and conceptual gaps in db-lib (libsybdb). libct is \
not the most complete implementation yet."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.17"

RPM_NAME = "libct4-1.3.17-1.3.aarch64.rpm"
RPM_HASH = "8de3151d7eb90f38945a55ac28579b74edfac286793f9d26e7bb5965256b9b1289ab6ad9bcb60b79f538303c38bdd3f502560e09d6b656d03cf068c6b36c0ce7"

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
