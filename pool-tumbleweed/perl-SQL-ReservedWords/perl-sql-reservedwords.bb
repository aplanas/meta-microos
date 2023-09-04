SUMMARY = "Reserved SQL words by ANSI/ISO"
DESCRIPTION = "Determine if words are reserved by ANSI/ISO SQL standard."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.8"

RPM_NAME = "perl-SQL-ReservedWords-0.8-5.26.noarch.rpm"
RPM_HASH = "a2b334000178d1cd2982beae9eea760f592b6fd6a630e1168da0b9b88da355b15a9c225b705775bbd3920f790582c5cd07fe919218dd98c1e8070b0f60a095eb"
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
perl--MODULE-COMPAT-5.38.0 \
perl-Sub--Exporter"

inherit rpm
