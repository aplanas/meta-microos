SUMMARY = "Libibmad runtime library"
DESCRIPTION = "Libibmad provides low layer IB functions for use by the IB diagnostic \
and management programs. These include MAD, SA, SMP, and other basic IB \
functions. This package contains the runtime library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "45.0"

RPM_NAME = "libibmad5-45.0-1.1.aarch64.rpm"
RPM_HASH = "4c186913153fb1380844d0564014847e3f854d11e22d47d079b84b8b0d8fc2c2a3e73ac76ccad206aa05346b8be970c1ac3e8d5edc009949f2460be6becd924a"

RPROVIDES:${PN} += "libibmad.so.5 \
libibmad5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibumad.so.3"

inherit rpm
