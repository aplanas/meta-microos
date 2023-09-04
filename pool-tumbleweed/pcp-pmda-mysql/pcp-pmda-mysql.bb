SUMMARY = "Performance Co-Pilot (PCP) metrics for MySQL"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the MySQL database."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-mysql-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "d864b41c2161a1cc0f9b524578bc1ee910dfd89b0ff5dde8bd62122e35462a3a58a59ea6010fb7ca8bf52acac7680c257e7c69da3ac72c2d908c70f8927b1687"

RPROVIDES:${PN} += "pcp-pmda-mysql"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-DBD--mysql \
perl-DBI \
perl-PCP-PMDA"

inherit rpm
