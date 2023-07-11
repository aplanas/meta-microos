SUMMARY = "Emulate the MySQL PASSWORD() function"
DESCRIPTION = "Crypt::MySQL emulates MySQL PASSWORD() SQL function, without \
libmysqlclient. You can compare encrypted passwords, without real MySQL \
environment."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.04"

RPM_NAME = "perl-Crypt-MySQL-0.04-1.36.aarch64.rpm"
RPM_HASH = "34ce20f427f814ba77f99c60ed7bd18d84dddc53ebb3b4f7862bf214895ca2e0fe22323441e36103b1781ce58627c5873364d7ac73c7f32de804cc120742afed"

RPROVIDES:${PN} += "perl-Crypt--MySQL \
perl-Crypt-MySQL"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1 \
perl-Digest--SHA1"

inherit rpm
