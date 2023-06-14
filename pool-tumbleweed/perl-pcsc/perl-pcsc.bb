SUMMARY = "Perl interface to Smart Card Reader"
DESCRIPTION = "PC/SC represents an abstraction layer to smart card readers. It \
provides a communication layer with a wide variety of smart card \
readers through a standardized API."
LICENSE = "GPL-2.0+"

PV = "1.4.14"

RPM_NAME = "perl-pcsc-1.4.14-1.33.aarch64.rpm"
RPM_HASH = "d37648b78141f5e302f0b97a3ca06e0bdf80f0f606f2e0e79fdfa5a06d183024a95b7588081104f7eb3adf4fe06b822fb934109ebf93de694ac07e00553c2389"

RPROVIDES:${PN} += "perl-Chipcard--PCSC \
perl-Chipcard--PCSC--Card \
perl-pcsc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.0 \
perl-base"

inherit rpm
