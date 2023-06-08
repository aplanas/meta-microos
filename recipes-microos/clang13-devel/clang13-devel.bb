SUMMARY = "CLANG frontend for LLVM (devel package)"
DESCRIPTION = "This package contains the clang (C language) frontend for LLVM. \
(development files)"
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "clang13-devel-13.0.1-8.1.aarch64.rpm"
RPM_HASH = "0a8964dce6e1024e1178d5865a8193be5ff7a36b130b69f4fec99ad7101cb1a4d10565e0ced3354e0c37eaed62bd17645b6732ac6edfe7f33188953312073581"

RPROVIDES:${PN} += "clang13-devel clang13-devel(aarch-64) cmake(Clang)"
RDEPENDS:${PN} += "/sbin/ldconfig clang-tools clang13 libclang-cpp13 libclang13 llvm13-devel"

inherit rpm
