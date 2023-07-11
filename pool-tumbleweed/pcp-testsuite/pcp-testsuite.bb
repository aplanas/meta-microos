SUMMARY = "Performance Co-Pilot (PCP) test suite"
DESCRIPTION = "Quality assurance test suite for Performance Co-Pilot (PCP)."
LICENSE = "GPL-2.0+ & MIT"

PV = "5.2.5"

RPM_NAME = "pcp-testsuite-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "dde792c504db64f83ce844b0efaf63ba6c6e77b0b9db74e0b2b23d5e56106c60d1f7630e00f3007a50627c4031ce9863bf05818582e2f0c0eb10a24cb3627cbf"

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
