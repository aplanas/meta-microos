SUMMARY = "InfiniBand Diagnostic Tools"
DESCRIPTION = "diags provides IB diagnostic programs and scripts needed to diagnose an \
IB subnet."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "45.0"

RPM_NAME = "infiniband-diags-45.0-1.1.aarch64.rpm"
RPM_HASH = "302f4e713cd55b78376c669074c20007c8477c109d9e45f50609bbcff68df2b7b0db9fc05d4c91ea3a7a1f46ab2d17bb56cd4617f863360fce0ca03bec8494b7"

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
