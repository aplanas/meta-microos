SUMMARY = "Headers and library links for libHYPRE_2_20_0-gnu-openmpi2-hpc"
DESCRIPTION = "HYPRE headers and libraries files needed for development \
This package contains development files of the openmpi2 version of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre_2_20_0-gnu-openmpi2-hpc-devel-2.20.0-1.24.aarch64.rpm"
RPM_HASH = "02f58aab814a891345e0aa5301e74885c8b0ca24670c244d9f2adb984220dbddaf10e501059308f4cf0fa2d7d575fb4fa57b5f98b438968616f36628bd103ac3"

RPROVIDES:${PN} += "hypre-2-20-0-gnu-openmpi2-hpc-devel \
pkgconfig-hypre"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libHYPRE-2-20-0-gnu-openmpi2-hpc \
libc.so.6 \
libopenblas-gnu-hpc-devel \
openmpi2-gnu-hpc-devel \
superlu-gnu-hpc-devel"

inherit rpm
