SUMMARY = "Many-body dispersion library -- headers and sources"
DESCRIPTION = "Libmbd implements the many-body dispersion (MBD) method in several programming \
languages and frameworks. This is the reference implementation in Fortran and \
C. \
 \
This package provides the files needed for developing against libmbd-openmpi4."
LICENSE = "MPL-2.0"

PV = "0.12.6"

RPM_NAME = "libmbd-openmpi4-devel-0.12.6-1.4.aarch64.rpm"
RPM_HASH = "f25749b737d1068b2f22f81431e821c0979b087f318a21b0dbef3f2fc3a8b76f798aaa3b0c4b9fd9aeaf95e61452e3a485237dac756ef5c05fe4de2f9307dc0f"

RPROVIDES:${PN} += "libmbd-openmpi4-devel"

RDEPENDS:${PN} += "libmbd-openmpi4 \
scalapack-openmpi4-devel"

inherit rpm
