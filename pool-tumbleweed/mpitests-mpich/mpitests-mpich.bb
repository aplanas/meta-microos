SUMMARY = "MPI Benchmarks and tests for mpich"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.3 OSU benchmarks ver 6.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-mpich-3.2-12.1.aarch64.rpm"
RPM_HASH = "449915d414b31e84dbedf9d1f18103cc82957067e26db7ba797d67ec067f59fa591669924da72112deec6c4909ec33787a85880e44718509fafeeb21db3fa895"

RPROVIDES:${PN} += "mpitests-mpich"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmpi.so.12 \
libstdc++.so.6 \
mpich \
mpitests"

inherit rpm
