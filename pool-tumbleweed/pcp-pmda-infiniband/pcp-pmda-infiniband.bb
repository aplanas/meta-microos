SUMMARY = "Performance Co-Pilot (PCP) metrics for Infiniband HCAs and switches"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting Infiniband statistics.  By default, it monitors the local HCAs \
but can also be configured to monitor remote GUIDs such as IB switches."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-infiniband-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "2c239d1f5f1bdc758c216acbdbb816fddd4145b039aee064eec2dd70bae279b1d6d9b0380988d2e84286d05f44a3f611f46be3e19be1d78005268c4b5df99e68"

RPROVIDES:${PN} += "pcp-pmda-infiniband"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibmad.so.5 \
libibumad.so.3 \
libpcp-pmda.so.3 \
libpcp.so.3"

inherit rpm
