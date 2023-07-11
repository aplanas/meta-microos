SUMMARY = "ODBC Driver for DBI"
DESCRIPTION = "ODBC Driver for DBI"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.61"

RPM_NAME = "perl-DBD-ODBC-1.61-1.19.aarch64.rpm"
RPM_HASH = "d6fff45f19a9064786993f7667ca0082ad8357b32d49fc36f48524d1af3eedf667e2856484647535c339d1d438f1fae0ad22cf127e004241c6e1f50a2c1b4902"

RPROVIDES:${PN} += "perl-DBD--ODBC \
perl-DBD-ODBC"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libodbc.so.2 \
perl--MODULE-COMPAT-5.36.1 \
perl-DBI \
perl-Test--Simple"

inherit rpm
