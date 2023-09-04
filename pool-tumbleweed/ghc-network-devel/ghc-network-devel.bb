SUMMARY = "Haskell network library development files"
DESCRIPTION = "This package provides the Haskell network library development files."
LICENSE = "BSD-3-Clause"

PV = "3.1.4.0"

RPM_NAME = "ghc-network-devel-3.1.4.0-2.3.aarch64.rpm"
RPM_HASH = "933532a136739cd9ed1761bf174a8d984b2975374e21af1e10a20ec85f1945a56fb5a047e7ae3cb2f1ec9966f2264882dd672094b978ee4d6179bfae673ab36f"

RPROVIDES:${PN} += "ghc-devel-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-network-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-directory-1.3.7.1 \
ghc-network"

inherit rpm
