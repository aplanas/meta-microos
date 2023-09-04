SUMMARY = "Libibmad runtime library"
DESCRIPTION = "Libibmad provides low layer IB functions for use by the IB diagnostic \
and management programs. These include MAD, SA, SMP, and other basic IB \
functions. This package contains the runtime library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "libibmad5-47.0-2.2.aarch64.rpm"
RPM_HASH = "4d8c36064439a8ad9b3e72c480e7a00f2c388a5e16e4596d8a3dc5fb7e49c7955ab5c6de157d8a8d57851b0cd8abf3363a51bf28a5c21b9a016abcd1c2a91c97"

RPROVIDES:${PN} += "libibmad.so.5 \
libibmad5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibumad.so.3"

inherit rpm
