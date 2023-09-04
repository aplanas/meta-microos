SUMMARY = "InfiniBand Diagnostic Tools"
DESCRIPTION = "diags provides IB diagnostic programs and scripts needed to diagnose an \
IB subnet."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "infiniband-diags-47.0-2.2.aarch64.rpm"
RPM_HASH = "a08aba8e46e4f3e8e77983a4bc27e6a8489bde009a8064e354d4afffea7a92a94109e7623e9f1a0edb8ebcf71612966bda8c4ddb5e1a305cee7fea728322df2b"

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
