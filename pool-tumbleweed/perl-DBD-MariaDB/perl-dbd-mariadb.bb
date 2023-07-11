SUMMARY = "MariaDB and MySQL driver for the Perl5 Database Interface (DBI)"
DESCRIPTION = "*DBD::MariaDB* is the Perl5 Database Interface driver for MariaDB and MySQL \
databases. In other words: DBD::MariaDB is an interface between the Perl \
programming language and the MariaDB/MySQL programming API that comes with \
the MariaDB/MySQL relational database management system. Most functions \
provided by this programming API are supported. Some rarely used functions \
are missing, mainly because no-one ever requested them."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.22"

RPM_NAME = "perl-DBD-MariaDB-1.22-1.12.aarch64.rpm"
RPM_HASH = "784c7cd9cefa10fc4405abe13070716adaa8d5a2dfde0be1ec931a938faffb14f2aaa4fe4aac525ca9e0dd411e4ee2c3ddf102b2279f45b6d2e972875e33482f"

RPROVIDES:${PN} += "perl-DBD--MariaDB \
perl-DBD-MariaDB"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmariadb.so.3 \
perl--MODULE-COMPAT-5.36.1 \
perl-DBI \
perl-DynaLoader \
perl-strict \
perl-warnings"

inherit rpm
