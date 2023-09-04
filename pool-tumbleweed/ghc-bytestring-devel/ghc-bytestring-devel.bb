SUMMARY = "Haskell bytestring library development files"
DESCRIPTION = "This package provides the Haskell bytestring library development files."
LICENSE = "BSD-3-Clause"

PV = "0.11.5.1"

RPM_NAME = "ghc-bytestring-devel-0.11.5.1-1.1.aarch64.rpm"
RPM_HASH = "a73b4cdc03111d91878a8a16cbef5e149a27152f3e05383bcc681fa13876875f6e7aabab43ace9be9e4941af154442b2b5b636d8a252eef21f7bc6d5b563b740"

RPROVIDES:${PN} += "ghc-bytestring-devel \
ghc-bytestring-static \
ghc-devel-bytestring-0.11.5.1"

RDEPENDS:${PN} += "ghc-bytestring \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-ghc-prim-0.9.1 \
ghc-devel-template-haskell-2.19.0.0"

inherit rpm
