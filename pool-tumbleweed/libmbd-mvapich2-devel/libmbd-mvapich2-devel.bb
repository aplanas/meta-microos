SUMMARY = "Many-body dispersion library -- headers and sources"
DESCRIPTION = "Libmbd implements the many-body dispersion (MBD) method in several programming \
languages and frameworks. This is the reference implementation in Fortran and \
C. \
 \
This package provides the files needed for developing against libmbd-mvapich2."
LICENSE = "MPL-2.0"

PV = "0.12.6"

RPM_NAME = "libmbd-mvapich2-devel-0.12.6-1.3.aarch64.rpm"
RPM_HASH = "dd20cafad26a006fe2515a1843b081dc8ffa7b30f7eba7ac9a0907626bc71d298c95ad4e51864425f31700ee7115941c6cd6f7e8f847a1c2cc0370262e40f45a"

RPROVIDES:${PN} += "libmbd-mvapich2-devel \
libmbd-mvapich2-devel(aarch-64)"

RDEPENDS:${PN} += "libmbd-mvapich2 \
scalapack-mvapich2-devel"

inherit rpm
