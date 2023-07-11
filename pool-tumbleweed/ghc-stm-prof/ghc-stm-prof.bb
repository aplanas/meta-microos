SUMMARY = "Haskell stm profiling library"
DESCRIPTION = "This package provides the Haskell stm profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.5.1.0"

RPM_NAME = "ghc-stm-prof-2.5.1.0-3.2.aarch64.rpm"
RPM_HASH = "38333993715c439562ff1d5637fe6c728eb92b4351378687eb01e37add2838bf8b00a05268ceb86fc3bed9036a33a752d5f66e847181023cbf2ef5541d771f93"

RPROVIDES:${PN} += "ghc-prof-stm-2.5.1.0 \
ghc-stm-prof"

RDEPENDS:${PN} += "ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.1.0 \
ghc-stm-devel"

inherit rpm
