SUMMARY = "Perl interface to Smart Card Reader"
DESCRIPTION = "PC/SC represents an abstraction layer to smart card readers. It \
provides a communication layer with a wide variety of smart card \
readers through a standardized API."
LICENSE = "GPL-2.0+"

PV = "1.4.14"

RPM_NAME = "perl-pcsc-1.4.14-1.35.aarch64.rpm"
RPM_HASH = "374a5aea2abf4cd1ecbfb57b2325c442b6b23b969920b6e7546c2135e7ed43a93a65f78aca4a78d2a2b5a5d65aed6ea5436d707e05e587404734509f2eb1c847"

RPROVIDES:${PN} += "perl-Chipcard--PCSC \
perl-Chipcard--PCSC--Card \
perl-pcsc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0 \
perl-base"

inherit rpm
