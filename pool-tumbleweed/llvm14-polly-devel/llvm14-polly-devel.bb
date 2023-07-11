SUMMARY = "Development files for Polly"
DESCRIPTION = "This package contains the development files for Polly."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "llvm14-polly-devel-14.0.6-10.1.aarch64.rpm"
RPM_HASH = "11c63162b7bdf54a883b3fb5d41926b9fcbe122af4e64f075d63274358d2d626718b93161bc6c27120dcea7e9fdf962ecf8a786a6abcddb791d51c2365ff0dcb"

RPROVIDES:${PN} += "cmake-Polly \
llvm-polly-devel-provider \
llvm14-polly-devel"

RDEPENDS:${PN} += "/sbin/ldconfig \
llvm14-devel \
llvm14-polly"

inherit rpm
