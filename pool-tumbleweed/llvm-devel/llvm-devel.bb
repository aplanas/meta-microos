SUMMARY = "Header Files for LLVM"
DESCRIPTION = "This package contains library and header files needed to develop \
new native programs that use the LLVM infrastructure. \
 \
This package is a dummy package that depends on the version of \
llvm-devel that openSUSE currently supports.  Packages that \
don't require a specific LLVM version should depend on this."
LICENSE = "Apache-2.0-with-LLVM-exception | NCSA"

PV = "16.0.6"

RPM_NAME = "llvm-devel-16.0.6-1.1.aarch64.rpm"
RPM_HASH = "4f0ce5b597be7c05c3d26b1e223d4569e3df911ddc11762dcf211a8521c56d204b1e0b9dfb911991b6194dddd5f80d6baf4ae6655ce0da0c7faa5631d4e22531"

RPROVIDES:${PN} += "llvm-LTO-devel \
llvm-devel"

RDEPENDS:${PN} += "llvm-gold \
llvm16-devel"

inherit rpm
