SUMMARY = "Performance Co-Pilot (PCP) metrics for MySQL"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the MySQL database."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-mysql-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "b890c436f73549475a219ccd41a03adf6c5c66d4c36a5f4db97ad4efb5e46bef167eaf5bec385843dace52056b93cbcd7a4f84f0030a7cda091d86f9f5da9188"

RPROVIDES:${PN} += "pcp-pmda-mysql"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-DBD--mysql \
perl-DBI \
perl-PCP-PMDA"

inherit rpm
