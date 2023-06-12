SUMMARY = "Haskell bimap profiling library"
DESCRIPTION = "This package provides the Haskell bimap profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "ghc-bimap-prof-0.5.0-2.2.aarch64.rpm"
RPM_HASH = "8341b5a4e4626ac027dd6aed60e6f85e58191df6d8e13eb2f89733c77af12fd0caec2be8d6f1dc2bbc22952d3982906559ac264e31e92c850779231dc817ae7d"

RPROVIDES:${PN} += "ghc-bimap-prof \
ghc-bimap-prof(aarch-64) \
ghc-prof(bimap-0.5.0-3nKyJuRybYg2I5XOsBhwKE)"
RDEPENDS:${PN} += "ghc-bimap-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(containers-0.6.7) \
ghc-prof(deepseq-1.4.8.0) \
ghc-prof(exceptions-0.10.5)"

inherit rpm
