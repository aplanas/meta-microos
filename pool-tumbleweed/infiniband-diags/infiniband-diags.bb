SUMMARY = "InfiniBand Diagnostic Tools"
DESCRIPTION = "diags provides IB diagnostic programs and scripts needed to diagnose an \
IB subnet."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "45.0"

RPM_NAME = "infiniband-diags-45.0-1.2.aarch64.rpm"
RPM_HASH = "4bcebe34fd0acdf5d1c5a4e7ac14af4cd840640ab6ff562bd13c0ab63204ed4bd852c5542f66ceed5c557549bcd413607636876b4b4ced0d17a075440445a387"

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
