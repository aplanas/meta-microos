SUMMARY = "Static libraries for fftw3"
DESCRIPTION = "Libraries to build statically linked applications with fftw3."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3_3_3_10-gnu-mvapich2-hpc-devel-static-3.3.10-3.7.aarch64.rpm"
RPM_HASH = "0732f24933eaac5848c56d5475ff174a8b0ef3e60e3723d5c49d4f957935b796caa39fbd82e5beeb39007705569b1e8e6823d28f5350166abe81d25e97376178"

RPROVIDES:${PN} += "fftw3-3-3-10-gnu-mvapich2-hpc-devel-static"

RDEPENDS:${PN} += "fftw3-3-3-10-gnu-mvapich2-hpc-devel"

inherit rpm
