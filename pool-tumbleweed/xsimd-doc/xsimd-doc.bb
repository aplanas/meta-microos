SUMMARY = "Documentation for xsimd"
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
This package contains the xsimd documentation"
LICENSE = "BSD-3-Clause"

PV = "10.0.0"

RPM_NAME = "xsimd-doc-10.0.0-1.3.aarch64.rpm"
RPM_HASH = "0b5348edca350d3aa17e69dcb1346314a53f9a0a6abbb246a1c4a6d625b62105b05160a7bd2c45b528fcececd8e6fb6fd3c851cbfd3dca8feab552ae86ee1853"

RPROVIDES:${PN} += "xsimd-doc"

RDEPENDS:${PN} += ""

inherit rpm
