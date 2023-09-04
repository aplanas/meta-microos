SUMMARY = "Emulate the MySQL PASSWORD() function"
DESCRIPTION = "Crypt::MySQL emulates MySQL PASSWORD() SQL function, without \
libmysqlclient. You can compare encrypted passwords, without real MySQL \
environment."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.04"

RPM_NAME = "perl-Crypt-MySQL-0.04-1.37.aarch64.rpm"
RPM_HASH = "91a7798c5e3b330fe8cf9ece8c25a2ccaa77574716eea27b27768a129762488ea6b73959bfc943e0fe8c646c36bfba29bfe1442dc52a1525e0ef255cc90096d1"

RPROVIDES:${PN} += "perl-Crypt--MySQL \
perl-Crypt-MySQL"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0 \
perl-Digest--SHA1"

inherit rpm
