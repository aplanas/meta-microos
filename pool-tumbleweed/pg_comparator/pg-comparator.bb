SUMMARY = "A tool to compare and sync tables in different locations"
DESCRIPTION = "PgComparator is a tool to compare possibly very big tables in different locations and report differences, with a network and time-efficient approach."
LICENSE = "BSD-3-Clause"

PV = "2.2.5"

RPM_NAME = "pg_comparator-2.2.5-5.18.aarch64.rpm"
RPM_HASH = "4af1aae537acb5da9096d2b02ea80094def36ef85011eb5304109f1ca8ee96b785b5dccdf68a5f8751e036afa48466abb41cc58b9f61b614db66f8d4093dcfdb"

RPROVIDES:${PN} += "pg_comparator \
pg_comparator(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/perl \
libc.so.6()(64bit) \
perl \
perl-DBD-Pg \
perl-DBD-mysql \
postgresql"

inherit rpm
