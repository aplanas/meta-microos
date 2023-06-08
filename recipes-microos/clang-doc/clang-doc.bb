SUMMARY = "Documentation for Clang"
DESCRIPTION = "This package contains documentation for the Clang compiler. \
 \
This package is a dummy package that depends on the version of \
clang-doc that openSUSE currently supports.  Packages that \
don't require a specific Clang version should depend on this."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "16.0.2"

RPM_NAME = "clang-doc-16.0.2-1.1.aarch64.rpm"
RPM_HASH = "868b6357388a7064d5b7d6fcd7792a0a7570c30cf8264bc49095f560725cf3d479e881cff788000c10ce3d224ef7a073c29097102ac631aec8a8c4f83ab064bb"

RPROVIDES:${PN} += "clang-doc clang-doc(aarch-64)"
RDEPENDS:${PN} += "clang clang16-doc"

inherit rpm
