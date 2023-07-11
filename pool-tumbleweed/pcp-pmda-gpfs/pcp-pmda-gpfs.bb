SUMMARY = "Performance Co-Pilot (PCP) metrics for GPFS Filesystem"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the GPFS filesystem."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-gpfs-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "3bd12cb6c5528f2d035141cd1d619e4de679dbc271311f5deb3bd012ad1120d980a0666d631bdbf2b95c31949279be4ba493fcd4fb49914cd82f608577354899"

RPROVIDES:${PN} += "pcp-pmda-gpfs"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA"

inherit rpm
