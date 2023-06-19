SUMMARY = "Development files for Polly"
DESCRIPTION = "This package contains the development files for Polly. \
 \
This package is a dummy package that depends on the version of \
llvm-polly-devel that openSUSE currently supports.  Packages that \
don't require a specific LLVM version should depend on this."
LICENSE = "Apache-2.0-with-LLVM-exception | NCSA"

PV = "16.0.4"

RPM_NAME = "llvm-polly-devel-16.0.4-1.1.aarch64.rpm"
RPM_HASH = "d344f9cf33d2b98fa1899c57e0031979c7e9725ab5f676ff4836aa2c8e6fefafc8a2023bbff7b88859db2e990cfd8cb0bda33065b6c7d93bbedcbbdb8aab08f4"

RPROVIDES:${PN} += "llvm-polly-devel"

RDEPENDS:${PN} += "llvm-polly \
llvm16-polly-devel"

inherit rpm
