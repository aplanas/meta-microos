SUMMARY = "Development files for Polly"
DESCRIPTION = "This package contains the development files for Polly."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "15.0.7"

RPM_NAME = "llvm15-polly-devel-15.0.7-2.4.aarch64.rpm"
RPM_HASH = "c12aa9c35aab085b305d962d477f268546689f4507c3b87d00ece4c3394af402060a7a84dad5b3df421ff6ff789fb1f4da3a29a2e65a2fadf80fe3543079b7d7"

RPROVIDES:${PN} += "cmake-Polly \
llvm-polly-devel-provider \
llvm15-polly-devel"

RDEPENDS:${PN} += "/sbin/ldconfig \
llvm15-devel \
llvm15-polly"

inherit rpm
