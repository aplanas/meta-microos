SUMMARY = "Haskell time profiling library"
DESCRIPTION = "This package provides the Haskell time profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "ghc-time-prof-1.12.2-3.1.aarch64.rpm"
RPM_HASH = "0e48b16ad32c42a7a68ace250997fa7f344d9702a49b7ebffef921bc904c25d647d0c1a1f0d22fda6e755f6dd17725bf8294141b886928364c10288b995128e1"

RPROVIDES:${PN} += "ghc-prof(time-1.12.2) \
ghc-time-prof \
ghc-time-prof(aarch-64)"

RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) \
ghc-prof(deepseq-1.4.8.0) \
ghc-time-devel(aarch-64)"

inherit rpm
