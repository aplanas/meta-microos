SUMMARY = "Intel MPI Benchmarks (IMB)"
DESCRIPTION = "The Intel MPI Benchmarks (IMB) perform a set of MPI performance \
measurements for point-to-point and global communication operations for \
a range of message sizes."
LICENSE = "BSD-3-Clause"

PV = "2021.3"

RPM_NAME = "imb-mvapich2-2021.3-1.2.aarch64.rpm"
RPM_HASH = "405ef0db5c5a0ace613e096e272415a793ba32685bec900b783aeadae9ff743302818b73d255a4a58080d0d0cb0a359e400d007d5a4790827401ef05be566684"

RPROVIDES:${PN} += "imb-mvapich2 \
imb-mvapich2(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libmpi.so.12()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
