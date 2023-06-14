SUMMARY = "Fortran library for fast updates of QR and Cholesky decompositions"
DESCRIPTION = "qrupdate is a Fortran library for fast updates of QR and Cholesky decompositions"
LICENSE = "GPL-3.0+"

PV = "1.1.2"

RPM_NAME = "libqrupdate1-1.1.2-3.31.aarch64.rpm"
RPM_HASH = "891d31f5574f7068b446c337cf67385f7508792566c1c9ce053e1afce47c4351203ac138339d2886969104fb8c37647649247e4028cd3ec856ed16b1b84f4ae2"

RPROVIDES:${PN} += "libqrupdate.so.1 \
libqrupdate1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libblas.so.3 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6"

inherit rpm
