SUMMARY = "Headers and library links for libHYPRE_2_20_0-gnu-mvapich2-hpc"
DESCRIPTION = "HYPRE headers and libraries files needed for development \
This package contains development files of the mvapich2 version of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre_2_20_0-gnu-mvapich2-hpc-devel-2.20.0-1.22.aarch64.rpm"
RPM_HASH = "45daf6c59a81a2e413de14c544cd2ed95357aec4c124ba13484a00b4543b9f53adcb501dd881d6dd41b8c5d3a5ccb3dd21dd470f5438675046e19e8ed4a994fb"

RPROVIDES:${PN} += "hypre_2_20_0-gnu-mvapich2-hpc-devel \
hypre_2_20_0-gnu-mvapich2-hpc-devel(aarch-64) \
pkgconfig(hypre)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libHYPRE_2_20_0-gnu-mvapich2-hpc \
libc.so.6(GLIBC_2.17)(64bit) \
libopenblas-gnu-hpc-devel \
mvapich2-gnu-hpc-devel \
superlu-gnu-hpc-devel"

inherit rpm
