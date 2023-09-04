SUMMARY = "Performance Co-Pilot (PCP) metrics for GPFS Filesystem"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the GPFS filesystem."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-gpfs-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "a204163100de52f9c440b23821b7f577c81ed0198576e41d4fb8cf60173de250184ea01201777a6d2982bf5d4e9439165357e68d0b8afaafe9d0ea86f7cfdc0b"

RPROVIDES:${PN} += "pcp-pmda-gpfs"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA"

inherit rpm
