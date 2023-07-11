SUMMARY = "Many-body dispersion library -- headers and sources"
DESCRIPTION = "Libmbd implements the many-body dispersion (MBD) method in several programming \
languages and frameworks. This is the reference implementation in Fortran and \
C. \
 \
This package provides the files needed for developing against libmbd-mvapich2."
LICENSE = "MPL-2.0"

PV = "0.12.6"

RPM_NAME = "libmbd-mvapich2-devel-0.12.6-1.4.aarch64.rpm"
RPM_HASH = "a75b9e64b18db9e3382d7efc0a627abd3d52129cbc4dc7d554df38e2a2e01145c0136745e98b5cdf9ca7b667802a946154179c33eed6a0758018964c598473ce"

RPROVIDES:${PN} += "libmbd-mvapich2-devel"

RDEPENDS:${PN} += "libmbd-mvapich2 \
scalapack-mvapich2-devel"

inherit rpm
