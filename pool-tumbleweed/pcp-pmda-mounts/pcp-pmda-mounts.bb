SUMMARY = "Performance Co-Pilot (PCP) metrics for filesystem mounts"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about filesystem mounts."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-mounts-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "9caa57c49441f2862ec7f2473b3c2c98c478b2e032de277aa5f1f3af25b7dfecf182b7613cdc5c8593f6dc156cea75956bb7bf1adbfe9ec693f3903dc50b8b07"

RPROVIDES:${PN} += "config(pcp-pmda-mounts) \
pcp-pmda-mounts \
pcp-pmda-mounts(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libpcp.so.3()(64bit) \
libpcp_pmda.so.3()(64bit)"

inherit rpm
