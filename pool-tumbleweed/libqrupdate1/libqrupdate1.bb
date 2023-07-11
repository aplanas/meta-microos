SUMMARY = "Fortran library for fast updates of QR and Cholesky decompositions"
DESCRIPTION = "qrupdate is a Fortran library for fast updates of QR and Cholesky decompositions"
LICENSE = "GPL-3.0+"

PV = "1.1.2"

RPM_NAME = "libqrupdate1-1.1.2-3.32.aarch64.rpm"
RPM_HASH = "b5a814c9be47c895c239d4cb14b2b9d49f87bbcea7cecf9e75844e7420f3eba5c3ca48c30ed4aeaab9c9b92a8a78a2c5dfedc1657d43442e34e90e709606c0fb"

RPROVIDES:${PN} += "libqrupdate.so.1 \
libqrupdate1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libblas.so.3 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6"

inherit rpm
