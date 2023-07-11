SUMMARY = "Parallelized Implementation of bzip2"
DESCRIPTION = "PBZIP2 is a parallel implementation of the bzip2 block-sorting file \
compressor that uses pthreads and achieves near-linear speedup on SMP \
machines."
LICENSE = "BSD-4-Clause"

PV = "1.1.13"

RPM_NAME = "pbzip2-1.1.13-3.19.aarch64.rpm"
RPM_HASH = "7dc3d1b3836c47855dfa4166b60046787cdbb68edb83033da7296c23cf9e01f70fcb7483b917b79a62be2e090ad16e2648077147fd70e56b1cff6f10035b1f3c"

RPROVIDES:${PN} += "pbzip2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
