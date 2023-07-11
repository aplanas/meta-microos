SUMMARY = "Performance Co-Pilot (PCP) metrics for the RPM package manager"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the installed RPM packages."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-rpm-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "21994f7fe128f82b919f60f64afdb0ee852e78ce63a84a7d23f59176efe34dde89dec1391c141198bafcc7cd3503049db6f739e69c1ad7eccaeeda17fe2d2f4c"

RPROVIDES:${PN} += "pcp-pmda-rpm"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3 \
librpm.so.9 \
pcp"

inherit rpm
