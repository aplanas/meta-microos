SUMMARY = "Haskell http-conduit profiling library"
DESCRIPTION = "This package provides the Haskell http-conduit profiling library."
LICENSE = "BSD-2-Clause"

PV = "2.3.8"

RPM_NAME = "ghc-http-conduit-prof-2.3.8-2.4.aarch64.rpm"
RPM_HASH = "2d327cf88f226d6434dd201f84bf0e9a877703aa7c2b25e772bef65a79b173b9cf8a84273aba8edd13031b87290665a900766efc38165becc8261acb4769c56a"

RPROVIDES:${PN} += "ghc-http-conduit-prof \
ghc-http-conduit-prof(aarch-64) \
ghc-prof(http-conduit-2.3.8-9gcbWW2UjPVHQDceZSAOIR)"
RDEPENDS:${PN} += "ghc-http-conduit-devel \
ghc-prof(aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP) \
ghc-prof(attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3) \
ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(conduit-1.3.4.3-dAZVHPSYjL2zQ4RzAuWi2) \
ghc-prof(conduit-extra-1.3.6-F6u9UYzIZvy2L2764Izuhr) \
ghc-prof(http-client-0.7.13.1-zzcC5JvmJYD0Lc0D9h215) \
ghc-prof(http-client-tls-0.3.6.1-1pQpHwWyWRWKJTeRlrZZA0) \
ghc-prof(http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6) \
ghc-prof(mtl-2.2.2) \
ghc-prof(resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv) \
ghc-prof(transformers-0.5.6.2) \
ghc-prof(unliftio-core-0.2.1.0-AEtYfdyUWlJCLfz2d4hPbj)"

inherit rpm
