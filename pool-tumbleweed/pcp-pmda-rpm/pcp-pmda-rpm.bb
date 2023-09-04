SUMMARY = "Performance Co-Pilot (PCP) metrics for the RPM package manager"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the installed RPM packages."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-rpm-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "c710798622cb1ec9a80ebf5cff52e8ed5008c9a728b1fc8bd766657c8c8cea651a29f9ac5582cd37313f2613923e6e2412dab7dcaa827498305b3680072910b9"

RPROVIDES:${PN} += "pcp-pmda-rpm"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3 \
librpm.so.9 \
pcp"

inherit rpm
