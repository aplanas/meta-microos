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

PV = "10.0.0"

RPM_NAME = "xsimd-devel-10.0.0-1.3.aarch64.rpm"
RPM_HASH = "93cf3e5226a4fc1fc41985e28a913fa72b637a8aa36ee0b7290de080832883bdee6f22d8cb076bc8441aa59c4f31a3bca7d2abfb790aa01d5c28543e2c661c31"

RPROVIDES:${PN} += "cmake(xsimd) \
pkgconfig(xsimd) \
xsimd-devel \
xsimd-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
