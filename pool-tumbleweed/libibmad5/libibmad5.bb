SUMMARY = "Libibmad runtime library"
DESCRIPTION = "Libibmad provides low layer IB functions for use by the IB diagnostic \
and management programs. These include MAD, SA, SMP, and other basic IB \
functions. This package contains the runtime library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "libibmad5-47.0-1.1.aarch64.rpm"
RPM_HASH = "b4a8a2ae8f026eff24ea8c578920ccb807b7d8b6756e6b22fc8f114cc0006ee24ca1889a020a7921e0b618d2fda6f50d3c6e893f6ca643628cade647992b7fcc"

RPROVIDES:${PN} += "libibmad.so.5 \
libibmad5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibumad.so.3"

inherit rpm
