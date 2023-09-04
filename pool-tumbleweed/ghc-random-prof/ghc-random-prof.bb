SUMMARY = "Haskell random profiling library"
DESCRIPTION = "This package provides the Haskell random profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.2.1.1"

RPM_NAME = "ghc-random-prof-1.2.1.1-2.3.aarch64.rpm"
RPM_HASH = "d923a0348d78c1f6bd3ae7a139288c7209786c5ab9ff1e0fc28410f49d41427378fe5fef363af7c1afacbd95826998b410a32865af64824d50321509c227a86f"

RPROVIDES:${PN} += "ghc-prof-random-1.2.1.1-DaR3VtSJjyj4XXOpfKJ29k \
ghc-random-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-mtl-2.2.2 \
ghc-prof-splitmix-0.1.0.4-2jzLu9hw0mWH5mdbN14y0O \
ghc-random-devel"

inherit rpm
