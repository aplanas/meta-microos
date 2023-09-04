SUMMARY = "ODBC Driver for DBI"
DESCRIPTION = "ODBC Driver for DBI"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.61"

RPM_NAME = "perl-DBD-ODBC-1.61-1.20.aarch64.rpm"
RPM_HASH = "552fa05d2fdce54c05df1635a4458f9493c121d2cd0f921124d0ad065222f76a07691b66359dab77352b780c58897a98ba747c85064f8be27b95653ffe75074d"

RPROVIDES:${PN} += "perl-DBD--ODBC \
perl-DBD-ODBC"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libodbc.so.2 \
perl--MODULE-COMPAT-5.38.0 \
perl-DBI \
perl-Test--Simple"

inherit rpm
