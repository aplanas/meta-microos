SUMMARY = "Performance Co-Pilot (PCP) metrics for 389 Directory Server Loggers"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics from a 389 Directory Server log."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-ds389log-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "7d8d013f578801fa7d4234434b61c7c44a3bb11e186e68fbdccc60002103b03c40b08807611e35b78e9de57293c4e19720900da6053ff681ca212634f8d47b99"

RPROVIDES:${PN} += "pcp-pmda-ds389log"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-Date-Manip \
perl-PCP-PMDA"

inherit rpm
