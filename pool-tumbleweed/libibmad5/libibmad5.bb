SUMMARY = "Libibmad runtime library"
DESCRIPTION = "Libibmad provides low layer IB functions for use by the IB diagnostic \
and management programs. These include MAD, SA, SMP, and other basic IB \
functions. This package contains the runtime library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "libibmad5-47.0-3.1.aarch64.rpm"
RPM_HASH = "31e4c5c314a44bb562b86b2b84db91731dd9c353f99c74809d07eb6bb1a3ee19deeeb272ee2956a0a3618fb9be4fc2fc0c803288ae41f980c3ff9e4332c91971"

RPROVIDES:${PN} += "libibmad.so.5 \
libibmad5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibumad.so.3"

inherit rpm
