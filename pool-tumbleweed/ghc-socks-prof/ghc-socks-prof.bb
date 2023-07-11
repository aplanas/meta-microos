SUMMARY = "Haskell socks profiling library"
DESCRIPTION = "This package provides the Haskell socks profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "ghc-socks-prof-0.6.1-6.7.aarch64.rpm"
RPM_HASH = "b1af7c266d1c47ff90b93e01d2210a712a7e77b3b027086e5510cb674fa2076d4783105f7540c43c551d07c88c642e88650c9bc2fea669aced75a32e6b5c8429"

RPROVIDES:${PN} += "ghc-prof-socks-0.6.1-8gBEgerYb38E7aCOOcHCwN \
ghc-socks-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-basement-0.0.16-J8UFRjmsTYU7wBgfpjdWQn \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-cereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f \
ghc-prof-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc \
ghc-socks-devel"

inherit rpm
