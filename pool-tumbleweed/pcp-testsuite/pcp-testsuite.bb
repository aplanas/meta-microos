SUMMARY = "Performance Co-Pilot (PCP) test suite"
DESCRIPTION = "Quality assurance test suite for Performance Co-Pilot (PCP)."
LICENSE = "GPL-2.0+ & MIT"

PV = "5.2.5"

RPM_NAME = "pcp-testsuite-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "5d37ebf5472d99089101d929165b1ef6be30cb28e5ea6df044f193def1bdbefb1a0040265f554b4e533a1fc22c93488fea553c8b8b87b1367f6148bb8f87972c"

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
