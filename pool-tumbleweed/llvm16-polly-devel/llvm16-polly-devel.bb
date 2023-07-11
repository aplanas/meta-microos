SUMMARY = "Development files for Polly"
DESCRIPTION = "This package contains the development files for Polly."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "16.0.6"

RPM_NAME = "llvm16-polly-devel-16.0.6-1.1.aarch64.rpm"
RPM_HASH = "130f20f75795aa553ce9d6e52123d16b8bc70e021d9f0a2278a019c8b5dbd0aca8985487974568877daf911a3fae767a8c6c0f8269588369264f0ed6677ecda2"

RPROVIDES:${PN} += "cmake-Polly \
llvm-polly-devel-provider \
llvm16-polly-devel"

RDEPENDS:${PN} += "/sbin/ldconfig \
llvm16-devel \
llvm16-polly"

inherit rpm
