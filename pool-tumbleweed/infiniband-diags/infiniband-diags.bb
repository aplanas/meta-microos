SUMMARY = "InfiniBand Diagnostic Tools"
DESCRIPTION = "diags provides IB diagnostic programs and scripts needed to diagnose an \
IB subnet."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "infiniband-diags-47.0-3.1.aarch64.rpm"
RPM_HASH = "9f5b90fcd491c895c42ee019b37650fbcba61b375c2832872d9dd89a5ae63953e5d993f88623db4a5377b6775a3c47def1151e10fa18dde0e748e7311b985a96"

RPROVIDES:${PN} += "config-infiniband-diags \
infiniband-diags"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibmad.so.5 \
libibnetdisc.so.5 \
libibumad.so.3 \
perl"

inherit rpm
