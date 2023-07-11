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

PV = "11.1.0"

RPM_NAME = "xsimd-doc-11.1.0-1.1.aarch64.rpm"
RPM_HASH = "9dff07e33f1e12f95953dd53ca26f2eb55310058f715f84bd6e4fb649d147f37d8338feae2687ae41e7399723e1152c94b2e1b21e6f4c707ed6d93ea318907e6"

RPROVIDES:${PN} += "xsimd-doc"

RDEPENDS:${PN} += ""

inherit rpm
