SUMMARY = "Performance Co-Pilot (PCP) metrics for Bonded network interfaces"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about bonded network interfaces."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-bonding-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "f2793c66a3d4a2f62b6fdb1d1e94ee00393601ec77813fe23bfe26864937598436301984517f86792441b491b69f6c5f20b935f5e85abe8d37205c7927d6125f"

RPROVIDES:${PN} += "pcp-pmda-bonding"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA"

inherit rpm
