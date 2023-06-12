SUMMARY = "Development files for Polly"
DESCRIPTION = "This package contains the development files for Polly."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "11.0.1"

RPM_NAME = "llvm11-polly-devel-11.0.1-13.1.aarch64.rpm"
RPM_HASH = "9975116faf2d4b42f8ab4f94bd29827deb7800bb19a5f1380405103e7d0d5891323f521342a1c40e448d3bceba8b0b0ca424aa353979326c95f02930e4ca4a91"

RPROVIDES:${PN} += "cmake(Polly) \
llvm-polly-devel-provider \
llvm11-polly-devel \
llvm11-polly-devel(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
llvm11-polly"

inherit rpm
