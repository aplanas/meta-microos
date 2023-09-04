SUMMARY = "Haskell bytestring profiling library"
DESCRIPTION = "This package provides the Haskell bytestring profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.11.5.1"

RPM_NAME = "ghc-bytestring-prof-0.11.5.1-1.1.aarch64.rpm"
RPM_HASH = "619d21d39996b240f19c81fc9f7d8b30ae35116fd2dbcccffda22ea03b739d3f0938dda970ad875793b8402a6e7eda20ec87feebfe2d92d347cab0d5f8146975"

RPROVIDES:${PN} += "ghc-bytestring-prof \
ghc-prof-bytestring-0.11.5.1"

RDEPENDS:${PN} += "ghc-bytestring-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-ghc-prim-0.9.1 \
ghc-prof-template-haskell-2.19.0.0"

inherit rpm
