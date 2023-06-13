SUMMARY = "ODBC Driver for DBI"
DESCRIPTION = "ODBC Driver for DBI"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.61"

RPM_NAME = "perl-DBD-ODBC-1.61-1.18.aarch64.rpm"
RPM_HASH = "3319b1acb0e7f6cb72b55d40abfb13b4c9bda6bf42508ac314177acaf0cef1263a0fb0cbeaca84df496c6120f0f343bab791c0da7a89d59003cbeebc8955141d"

RPROVIDES:${PN} += "perl(DBD::ODBC) \
perl-DBD-ODBC \
perl-DBD-ODBC(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libodbc.so.2()(64bit) \
perl(:MODULE_COMPAT_5.36.0) \
perl(DBI) \
perl(Test::Simple)"

inherit rpm
