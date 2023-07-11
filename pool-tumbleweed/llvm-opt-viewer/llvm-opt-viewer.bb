SUMMARY = "Tools for visualising the LLVM optimization records"
DESCRIPTION = "Set of tools for visualising the LLVM optimization records generated \
with -fsave-optimization-record. Used for compiler-assisted performance \
analysis. \
 \
This package is a dummy package that depends on the version of \
llvm-opt-viewer that openSUSE currently supports.  Packages that \
don't require a specific LLVM version should depend on this."
LICENSE = "Apache-2.0-with-LLVM-exception | NCSA"

PV = "16.0.6"

RPM_NAME = "llvm-opt-viewer-16.0.6-1.1.noarch.rpm"
RPM_HASH = "5784db5761c61462baefc76f3fb3b50bb07f20a7db9e1f88f2065cfab846609f091f131dc6642a53c4dd0a36a8b38ad563c3dd40f591f6ac0ae3f992129a13d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm-opt-viewer"

RDEPENDS:${PN} += "llvm16-opt-viewer"

inherit rpm
