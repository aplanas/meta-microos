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

RPM_NAME = "jconvolver-1.1.0-1.3.aarch64.rpm"
RPM_HASH = "c13145f009a0416f800f56ea716b41ea5dab55512af853e70090c52a1c87a3b6805f1ba327826c5008038bb50b74eca4f92cb212261ecafa14c409b1d8c42888"

RPROVIDES:${PN} += "jconvolver \
jconvolver(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libjack.so.0()(64bit) \
libm.so.6()(64bit) \
libsndfile.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libzita-convolver.so.4()(64bit)"

inherit rpm
