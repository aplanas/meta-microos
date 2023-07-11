SUMMARY = "Libibmad runtime library"
DESCRIPTION = "Libibmad provides low layer IB functions for use by the IB diagnostic \
and management programs. These include MAD, SA, SMP, and other basic IB \
functions. This package contains the runtime library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "45.0"

RPM_NAME = "libibmad5-45.0-1.2.aarch64.rpm"
RPM_HASH = "c250fb54a321db542c4bb0f8be25159ba467c004a5dd7879e5d5fa9b7d8e8b704a69bfdc8fdadae1a7cc76eb14e44b4e369ab2d864e657f8026556f656031042"

RPROVIDES:${PN} += "libibmad.so.5 \
libibmad5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibumad.so.3"

inherit rpm
