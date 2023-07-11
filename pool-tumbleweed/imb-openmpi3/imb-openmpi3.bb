SUMMARY = "Intel MPI Benchmarks (IMB)"
DESCRIPTION = "The Intel MPI Benchmarks (IMB) perform a set of MPI performance \
measurements for point-to-point and global communication operations for \
a range of message sizes."
LICENSE = "BSD-3-Clause"

PV = "2021.3"

RPM_NAME = "imb-openmpi3-2021.3-1.3.aarch64.rpm"
RPM_HASH = "f48dcfdbc683bb3d9bd9c056a74b34ed8b002a0140c6f521de8f07b4c4f2186ba69a2a8183db2f56917a49ac1b4f105ea0ca99103ee7fabe1131b470cf38a770"

RPROVIDES:${PN} += "imb-openmpi3"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libgcc-s.so.1 \
libmpi.so.40 \
libstdc++.so.6"

inherit rpm
