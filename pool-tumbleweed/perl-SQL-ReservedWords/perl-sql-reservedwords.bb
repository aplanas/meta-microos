SUMMARY = "Reserved SQL words by ANSI/ISO"
DESCRIPTION = "Determine if words are reserved by ANSI/ISO SQL standard."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.8"

RPM_NAME = "perl-SQL-ReservedWords-0.8-5.25.noarch.rpm"
RPM_HASH = "dbda96799e10d6e71f259edf04fcb46d5bc06655450ebf5f0918ad810957e540cf11d45041bffb1e9878bbbe18f8f1f800caba278aa058576e895e2b625b658e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-SQL--ReservedWords \
perl-SQL--ReservedWords--DB2 \
perl-SQL--ReservedWords--MySQL \
perl-SQL--ReservedWords--ODBC \
perl-SQL--ReservedWords--Oracle \
perl-SQL--ReservedWords--PostgreSQL \
perl-SQL--ReservedWords--SQLServer \
perl-SQL--ReservedWords--SQLite \
perl-SQL--ReservedWords--Sybase \
perl-SQL-ReservedWords"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1 \
perl-Sub--Exporter"

inherit rpm
