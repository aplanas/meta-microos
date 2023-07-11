SUMMARY = "Convolution engine for JACK"
DESCRIPTION = "Jconvolver is a Convolution Engine for JACK, based on FFT convolution and using \
non-uniform partition sizes: small ones at the start of the IR and building up \
to the most efficient size further on. It can perform zero-delay processing with \
moderate CPU load. \
 \
Main features: \
  * Any matrix of convolutions between up to up 64 inputs and 64 outputs, as \
    long as your CPU(s) can handle it. \
  * Allows trading off CPU load to processing delay, and remains efficient even \
    when configured for zero delay. \
  * Sparse and diagonal matrices are handled as efficiently as dense ones. \
    No CPU cycles or memory resources are wasted on empty cells in the matrix, \
    nor on empty partitions if IRs are of different length."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.0"

RPM_NAME = "jconvolver-1.1.0-1.4.aarch64.rpm"
RPM_HASH = "251f776b47e6f75430e328ebd89fdbe911f40896eb52f5869b6a2df591064cebb897511499490e2ffa6952d89a22ea2f7153a74788f6578d3b13c5ffcc2a19d0"

RPROVIDES:${PN} += "jconvolver"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libjack.so.0 \
libm.so.6 \
libsndfile.so.1 \
libstdc++.so.6 \
libzita-convolver.so.4"

inherit rpm
