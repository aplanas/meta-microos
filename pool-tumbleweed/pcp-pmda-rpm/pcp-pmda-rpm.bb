SUMMARY = "Performance Co-Pilot (PCP) metrics for the RPM package manager"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the installed RPM packages."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-rpm-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "2fe22f9cb0b3e00866830df490de2f0a0278614220b2c6b3d24b3d12bb64a77d70290527a96a65b590cbdd87899bd2da0eb9fd7a17168ad87f3c946ff1529fd2"

RPROVIDES:${PN} += "pcp-pmda-rpm"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3 \
librpm.so.9 \
pcp"

inherit rpm
