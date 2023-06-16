SUMMARY = "Performance Co-Pilot (PCP) test suite"
DESCRIPTION = "Quality assurance test suite for Performance Co-Pilot (PCP)."
LICENSE = "GPL-2.0+ & MIT"

PV = "5.2.5"

RPM_NAME = "pcp-testsuite-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "b063f85d4bcda2ca9aff09b39fb26e3a28f3558e7815d2236eee7866da65b595a6b15ad0a32bbac6df80ea6f02bc14cd1b1a8109c3c1f0cd9328a1c72a1b1d9f"

RPROVIDES:${PN} += "pcp-testsuite \
perl-Slurm \
perl-Slurm--Hostlist"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3 \
libstdc++.so.6 \
pcp \
pcp-devel"

inherit rpm
