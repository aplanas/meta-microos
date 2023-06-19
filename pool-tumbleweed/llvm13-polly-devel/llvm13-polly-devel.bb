SUMMARY = "Development files for Polly"
DESCRIPTION = "This package contains the development files for Polly."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "llvm13-polly-devel-13.0.1-9.1.aarch64.rpm"
RPM_HASH = "4d4d3a3b5e6a8ff45332a7911ab60c2bf64e72753670e6ad70817d6735da3199f371136951fdd65a33a4336bbbbab7b5bd7f39b1ce089fc442e75659e6d65c1d"

RPROVIDES:${PN} += "cmake-Polly \
llvm-polly-devel-provider \
llvm13-polly-devel"

RDEPENDS:${PN} += "/sbin/ldconfig \
llvm13-devel \
llvm13-polly"

inherit rpm
