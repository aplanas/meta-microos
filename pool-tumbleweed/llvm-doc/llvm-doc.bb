SUMMARY = "Documentation for LLVM"
DESCRIPTION = "This package contains documentation for the LLVM infrastructure. \
 \
This package is a dummy package that depends on the version of \
llvm-doc that openSUSE currently supports.  Packages that \
don't require a specific LLVM version should depend on this."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "16.0.4"

RPM_NAME = "llvm-doc-16.0.4-1.1.aarch64.rpm"
RPM_HASH = "e74cd409e35c9a8f3828100a32877b94303406e7b3b398e8d730cf0969a30467a1e8f9aff0d56affccd871a94a6585650d1dbdf07a7b93c2c2ebb84d2b77d35d"

RPROVIDES:${PN} += "llvm-doc \
llvm-doc(aarch-64)"

RDEPENDS:${PN} += "llvm \
llvm16-doc"

inherit rpm
