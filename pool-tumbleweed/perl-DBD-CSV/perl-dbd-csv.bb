SUMMARY = "DBI driver for CSV files"
DESCRIPTION = "The DBD::CSV module is yet another driver for the DBI (Database independent \
interface for Perl). This one is based on the SQL 'engine' SQL::Statement \
and the abstract DBI driver DBD::File and implements access to so-called \
CSV files (Comma Separated Values). Such files are often used for exporting \
MS Access and MS Excel data. \
 \
See DBI for details on DBI, SQL::Statement for details on SQL::Statement \
and DBD::File for details on the base class DBD::File."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.60"

RPM_NAME = "perl-DBD-CSV-0.60-1.2.noarch.rpm"
RPM_HASH = "146ee358646f8cdbd1af87643b339db88c16f8c9d49337c4c73f4fc778c547d628ea3d1e81b43624d51ed07a107ebc22b82b7f4bbe383aac0cc30979d4b72628"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Bundle--DBD--CSV \
perl-DBD--CSV \
perl-DBD--CSV--GetInfo \
perl-DBD--CSV--Statement \
perl-DBD--CSV--Table \
perl-DBD--CSV--TypeInfo \
perl-DBD--CSV--db \
perl-DBD--CSV--dr \
perl-DBD--CSV--st \
perl-DBD-CSV"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-DBD--File \
perl-DBI \
perl-SQL--Statement \
perl-Test--More \
perl-Text--CSV-XS"

inherit rpm
