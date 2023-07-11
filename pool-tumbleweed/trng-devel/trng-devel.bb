SUMMARY = "Headers and devel files for TRNG"
DESCRIPTION = "TRNG is a C++ pseudo random number generator library. \
 \
This package provides the headers and devel files for developing \
applications against TRNG."
LICENSE = "BSD-3-Clause"

PV = "4.24"

RPM_NAME = "trng-devel-4.24-2.8.aarch64.rpm"
RPM_HASH = "ca911b497f1ade37e13b3299f4431d8adc0b78a675f173ad64a6803a3774a7e7a3247115ad0574f94fe392c38bda29d357cf0ac279d9b237720b36c79187f6f9"

RPROVIDES:${PN} += "trng-devel"

RDEPENDS:${PN} += "libtrng4-24"

inherit rpm
