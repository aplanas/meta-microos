SUMMARY = "MariaDB and MySQL driver for the Perl5 Database Interface (DBI)"
DESCRIPTION = "*DBD::MariaDB* is the Perl5 Database Interface driver for MariaDB and MySQL \
databases. In other words: DBD::MariaDB is an interface between the Perl \
programming language and the MariaDB/MySQL programming API that comes with \
the MariaDB/MySQL relational database management system. Most functions \
provided by this programming API are supported. Some rarely used functions \
are missing, mainly because no-one ever requested them."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.22"

RPM_NAME = "perl-DBD-MariaDB-1.22-1.13.aarch64.rpm"
RPM_HASH = "52a34d9a986a29520210460b81836e79f1e917ce91637d08be0697e4a0cf9c59f5e86dbdcfbcb0821279b9aad57cdd6adf80251d1c962ba7dbf54ddb05078b44"

RPROVIDES:${PN} += "perl-DBD--MariaDB \
perl-DBD-MariaDB"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmariadb.so.3 \
perl--MODULE-COMPAT-5.38.0 \
perl-DBI \
perl-DynaLoader \
perl-strict \
perl-warnings"

inherit rpm
