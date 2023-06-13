SUMMARY = "Development files for Polly"
DESCRIPTION = "This package contains the development files for Polly."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "12.0.1"

RPM_NAME = "llvm12-polly-devel-12.0.1-12.1.aarch64.rpm"
RPM_HASH = "14e2786572dfb5a35a37a34f38b9fa259864ea3747eb1d3e8d8f117d0f869996cce24d6f4c74fba5fe7afc15561d21e0c732242167945a5a01ca8507e430f59d"

RPROVIDES:${PN} += "cmake(Polly) \
llvm-polly-devel-provider \
llvm12-polly-devel \
llvm12-polly-devel(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
llvm12-polly"

inherit rpm
