SUMMARY = "Haskell safe profiling library"
DESCRIPTION = "This package provides the Haskell safe profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.3.19"

RPM_NAME = "ghc-safe-prof-0.3.19-4.8.aarch64.rpm"
RPM_HASH = "4fc011fbcd0cb280e4c4d8782fc2a3991a6765b6a08cdcc0d7553b69bb3ae14385917ae8c669e973ebc475af661f9ecaad894115fe72ea91d4c21669a20662a3"

RPROVIDES:${PN} += "ghc-prof-safe-0.3.19-9uHvZjuyLiR13wOGSONZxX \
ghc-safe-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-safe-devel"

inherit rpm
