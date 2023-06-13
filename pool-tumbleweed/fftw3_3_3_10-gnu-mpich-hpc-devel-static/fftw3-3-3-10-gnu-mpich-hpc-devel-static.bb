SUMMARY = "Static libraries for fftw3"
DESCRIPTION = "Libraries to build statically linked applications with fftw3."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3_3_3_10-gnu-mpich-hpc-devel-static-3.3.10-3.6.aarch64.rpm"
RPM_HASH = "ad02e636eadfe2db1d17779559515c20121e9c0081030186d626740781c4c651a2a06388c72f4f983a226aa2d87afbdd0a4dd10433d0b7aa36751f05f0be4521"

RPROVIDES:${PN} += "fftw3_3_3_10-gnu-mpich-hpc-devel-static \
fftw3_3_3_10-gnu-mpich-hpc-devel-static(aarch-64)"

RDEPENDS:${PN} += "fftw3_3_3_10-gnu-mpich-hpc-devel"

inherit rpm
