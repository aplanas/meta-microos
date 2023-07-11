SUMMARY = "Dynamic libraries from mopac7"
DESCRIPTION = "MOPAC7 is a semi-empirical quantum-mechanics code written by James J. P. \
Stewart and co-workers. The purpose of this project is to maintain MOPAC7 as \
a stand-alone program as well as a library that provides the functionality \
of MOPAC7 to other programs. \
 \
This package contains dynamic libraries."
LICENSE = "SUSE-Public-Domain"

PV = "1.15"

RPM_NAME = "libmopac7-1-1.15-8.4.aarch64.rpm"
RPM_HASH = "dab8d0f851de92b6dc7f5c26c237c7e88aef8930c844b11452cf48c671b3c8ed1134fce643e758766078787663e596e29f6db0a09bfa76ea4f9394dbf2dab577"

RPROVIDES:${PN} += "libmopac7-1 \
libmopac7.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6"

inherit rpm
