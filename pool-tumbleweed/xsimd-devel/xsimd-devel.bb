SUMMARY = "Development files for xsimd"
DESCRIPTION = "SIMD (Single Instruction, Multiple Data) is a feature of microprocessors that \
has been available for many years. SIMD instructions perform a single operation \
on a batch of values at once, and thus provide a way to significantly accelerate \
code execution. However, these instructions differ between microprocessor \
vendors and compilers. \
 \
xsimd provides a unified means for using these features for library authors. \
Namely, it enables manipulation of batches of numbers with the same arithmetic \
operators as for single values. It also provides accelerated implementation of \
common mathematical functions operating on batches. \
 \
This package contains the developments files needed to use xsimd"
LICENSE = "BSD-3-Clause"

PV = "11.1.0"

RPM_NAME = "xsimd-devel-11.1.0-1.1.aarch64.rpm"
RPM_HASH = "ff7146a42210eda4a7802953096ef0f31c1f6653818517fceaa547efacbf1ae2464c6d0a072d4e0aa6dae1001cb23a809bb2a2606a5bc22233d2c99221021b7a"

RPROVIDES:${PN} += "cmake-xsimd \
pkgconfig-xsimd \
xsimd-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
