SUMMARY = "Performance Co-Pilot (PCP) metrics for MySQL"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the MySQL database."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-mysql-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "375f0409a7ba3fedd0deddba04a85a632c14594262f34ab642007a857e9c18785c4ee88318b1977347fdba41c29dae7cf43d2af8e49130e66e0c9aa6af7b93b9"

RPROVIDES:${PN} += "pcp-pmda-mysql"

RDEPENDS:${PN} += "/bin/sh \
perl-DBD--mysql \
perl-DBI \
perl-PCP-PMDA"

inherit rpm
