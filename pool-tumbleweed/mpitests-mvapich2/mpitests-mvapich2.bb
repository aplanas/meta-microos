SUMMARY = "MPI Benchmarks and tests for mvapich2"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.3 OSU benchmarks ver 6.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-mvapich2-3.2-12.1.aarch64.rpm"
RPM_HASH = "4068772074ae32c33165ecd1908c14e4cef11bd4b71384ce586d1c4645ed05e600da584d509598428ebf50f990ca18a39bb0a02ea5a630f97a520b1ce35241c4"

RPROVIDES:${PN} += "mpitests-mvapich2"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmpi.so.12 \
libstdc++.so.6 \
mpitests \
mvapich2"

inherit rpm
