SUMMARY = "ARM Compute Library"
DESCRIPTION = "A software library for computer vision and machine learning. \
The Compute Library is a collection of low-level functions optimized for Arm CPU and GPU architectures targeted at image processing, computer vision, and machine learning. \
Examples binaries part."
LICENSE = "MIT"

PV = "23.05"

RPM_NAME = "ComputeLibrary-23.05-1.2.aarch64.rpm"
RPM_HASH = "c698af726494690e73b51e8fcd06cdaa28891d40592e291cec8d3d61e747bf015e47f2d5ca73e559cb56dfbcb34b90665a80678fa6c0ceb5c0a3cb1a48adc25c"

RPROVIDES:${PN} += "ComputeLibrary"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libarm-compute-graph.so.31 \
libarm-compute.so.31 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
