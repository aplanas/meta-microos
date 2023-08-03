SUMMARY = "InfiniBand Diagnostic Tools"
DESCRIPTION = "diags provides IB diagnostic programs and scripts needed to diagnose an \
IB subnet."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "infiniband-diags-47.0-1.1.aarch64.rpm"
RPM_HASH = "885e60e0ab57d0c35717d192541ea3c2d39fb470ab1f4721f70128b4ad0627d415a438c6e1dc1455bd4695ab06f32bd03f4cc31e49f1c49ae309f5886e1cbb8a"

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
