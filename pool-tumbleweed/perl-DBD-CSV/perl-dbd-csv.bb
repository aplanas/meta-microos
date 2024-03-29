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

RPM_NAME = "perl-DBD-CSV-0.60-1.3.noarch.rpm"
RPM_HASH = "989162370ef7b2a6b05ee8147d42b8c7e6d583119f5b29f4a599c31c284a6bcaa5ebfe618f07604651a838fe345ffd0a25b34eda05a004fad7359597e2ee6b1a"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-DBD--File \
perl-DBI \
perl-SQL--Statement \
perl-Test--More \
perl-Text--CSV-XS"

inherit rpm
