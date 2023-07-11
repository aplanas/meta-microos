SUMMARY = "Development files for Polly"
DESCRIPTION = "This package contains the development files for Polly."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "15.0.7"

RPM_NAME = "llvm15-polly-devel-15.0.7-3.1.aarch64.rpm"
RPM_HASH = "492a5643ac9348ddef5bf3de04f9e9784ce3e88560c033c844912672a5cd0f782d659fd9121de63a4b374daf7eea03e67752e71eaf749b3e47c5e0f84232f579"

RPROVIDES:${PN} += "cmake-Polly \
llvm-polly-devel-provider \
llvm15-polly-devel"

RDEPENDS:${PN} += "/sbin/ldconfig \
llvm15-devel \
llvm15-polly"

inherit rpm
