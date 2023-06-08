SUMMARY = "CLANG frontend for LLVM (devel package)"
DESCRIPTION = "This package contains the clang (C language) frontend for LLVM. \
(development files)"
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "clang14-devel-14.0.6-8.1.aarch64.rpm"
RPM_HASH = "1236530c03f6f47abf366eef77be5ffc5929c1d5697eb03d123a705eacab9598c9caaa2bc235b5118ab34b9598e7b2a1a87e9e6796139c10764403f408ce38cc"

RPROVIDES:${PN} += "clang14-devel clang14-devel(aarch-64) cmake(Clang)"
RDEPENDS:${PN} += "/sbin/ldconfig clang-tools clang14 libclang-cpp14 libclang13 llvm14-devel"

inherit rpm
