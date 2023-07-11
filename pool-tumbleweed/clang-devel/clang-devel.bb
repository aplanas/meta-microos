SUMMARY = "CLANG frontend for LLVM (devel package)"
DESCRIPTION = "This package contains the clang (C language) frontend for LLVM. \
(development files) \
 \
This package is a dummy package that depends on the version of \
clang-devel that openSUSE currently supports.  Packages that \
don't require a specific Clang version should depend on this."
LICENSE = "Apache-2.0-with-LLVM-exception | NCSA"

PV = "16.0.6"

RPM_NAME = "clang-devel-16.0.6-1.1.aarch64.rpm"
RPM_HASH = "d491ae36dd774302faaf614120a624e9a265ddfee9bd6c2599f0a00f80619601bd1153ff76fe277f8684dbe049010446f3f11d698855bf4264b018795a0f2a0e"

RPROVIDES:${PN} += "clang-devel \
clang-devel-static \
llvm-clang-devel"

RDEPENDS:${PN} += "clang16-devel"

inherit rpm
