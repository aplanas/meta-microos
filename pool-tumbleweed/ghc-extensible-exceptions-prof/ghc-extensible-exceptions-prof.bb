SUMMARY = "Haskell extensible-exceptions profiling library"
DESCRIPTION = "This package provides the Haskell extensible-exceptions profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.4"

RPM_NAME = "ghc-extensible-exceptions-prof-0.1.1.4-7.2.aarch64.rpm"
RPM_HASH = "a6f1cd773175746c79cb393208dfd4802da99dfc59b6f27c4efa77934e41d984c11978b99926da5a181ecdeb75bfec350f03474e29adfbd0ed856645c54aba18"

RPROVIDES:${PN} += "ghc-extensible-exceptions-prof \
ghc-extensible-exceptions-prof(aarch-64) \
ghc-prof(extensible-exceptions-0.1.1.4-ItoFoaqbPMuGIlsBr6VhGY)"
RDEPENDS:${PN} += "ghc-extensible-exceptions-devel \
ghc-prof(base-4.17.1.0)"

inherit rpm
