SUMMARY = "A partitioned convolution engine library"
DESCRIPTION = "Convolution engine based on FFT convolution and using non-uniform partition \
sizes: small ones at the start of the IR and building up to the most efficient \
size further on. It can perform zero-delay processing with moderate CPU load. \
 \
Main features: \
  * Any matrix of convolutions between up to up 64 inputs and 64 outputs, as \
    long as your CPU(s) can handle it. \
  * Allows trading off CPU load to processing delay, and remains efficient even \
    when configured for zero delay. \
  * Sparse and diagonal matrices are handled as efficiently as dense ones. \
    No CPU cycles or memory resources are wasted on empty cells in the matrix, \
    nor on empty partitions if IRs are of different length."
LICENSE = "GPL-3.0-or-later"

PV = "4.0.3"

RPM_NAME = "libzita-convolver4-4.0.3-1.15.aarch64.rpm"
RPM_HASH = "81c3857a3d332e98485c99e63da101291bb80ea919224e3c02205dade94245e21bfd79ca2d6b5791591e91014e501672bb4d5f9edbab21e91db04663ccbfe252"

RPROVIDES:${PN} += "libzita-convolver.so.4 \
libzita-convolver4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
