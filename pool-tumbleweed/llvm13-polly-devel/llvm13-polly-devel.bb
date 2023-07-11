SUMMARY = "Development files for Polly"
DESCRIPTION = "This package contains the development files for Polly."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "llvm13-polly-devel-13.0.1-10.1.aarch64.rpm"
RPM_HASH = "7167b1ef7da373caf2d46eb631e3ae48410a099d70fca0af10313c49969b6b2d7bdcecee104f455de6592934b1b383257e74f248243a168679d5c310d8c80c8a"

RPROVIDES:${PN} += "cmake-Polly \
llvm-polly-devel-provider \
llvm13-polly-devel"

RDEPENDS:${PN} += "/sbin/ldconfig \
llvm13-devel \
llvm13-polly"

inherit rpm
