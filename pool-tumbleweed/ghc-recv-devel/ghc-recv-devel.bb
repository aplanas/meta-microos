SUMMARY = "Haskell recv library development files"
DESCRIPTION = "This package provides the Haskell recv library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.0"

RPM_NAME = "ghc-recv-devel-0.1.0-1.8.aarch64.rpm"
RPM_HASH = "7fac1c7793a985ad6fa80a736a7a38dce407054ebcf7c4c93734a56b4f8e4f40eb55b0f174cc810a194c7bf90b2143f5774604e991f1dd484a6e2f392482f038"

RPROVIDES:${PN} += "ghc-devel-recv-0.1.0-E4Of8dJv2WfHRGIVsQUgMj \
ghc-recv-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-recv"

inherit rpm
