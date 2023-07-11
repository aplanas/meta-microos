SUMMARY = "Development files for Polly"
DESCRIPTION = "This package contains the development files for Polly. \
 \
This package is a dummy package that depends on the version of \
llvm-polly-devel that openSUSE currently supports.  Packages that \
don't require a specific LLVM version should depend on this."
LICENSE = "Apache-2.0-with-LLVM-exception | NCSA"

PV = "16.0.6"

RPM_NAME = "llvm-polly-devel-16.0.6-1.1.aarch64.rpm"
RPM_HASH = "2b73528a89099a695b221907c9b895d2b40b3b2ee9c9188c2da051a0b3e4857ecb2613938c6a6f2caa6cbc6123827589b2812a0500a7e1b967c1c6d11f43d0be"

RPROVIDES:${PN} += "llvm-polly-devel"

RDEPENDS:${PN} += "llvm-polly \
llvm16-polly-devel"

inherit rpm
