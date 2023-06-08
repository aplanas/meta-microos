SUMMARY = "Haskell http-conduit library development files"
DESCRIPTION = "This package provides the Haskell http-conduit library development files."
LICENSE = "BSD-2-Clause"

PV = "2.3.8"

RPM_NAME = "ghc-http-conduit-devel-2.3.8-2.4.aarch64.rpm"
RPM_HASH = "ee5ce011746da310d22eb2259bdb37f4d70629e833101ab905b7ecd1d8fc3cd3e4e6f80f59a3f12106a57c324e7dcf55bac87b3382754689e00519fedda6e751"

RPROVIDES:${PN} += "ghc-devel(http-conduit-2.3.8-9gcbWW2UjPVHQDceZSAOIR) ghc-http-conduit-devel ghc-http-conduit-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ghc-compiler ghc-devel(aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP) ghc-devel(attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3) ghc-devel(base-4.17.1.0) ghc-devel(bytestring-0.11.4.0) ghc-devel(conduit-1.3.4.3-dAZVHPSYjL2zQ4RzAuWi2) ghc-devel(conduit-extra-1.3.6-F6u9UYzIZvy2L2764Izuhr) ghc-devel(http-client-0.7.13.1-zzcC5JvmJYD0Lc0D9h215) ghc-devel(http-client-tls-0.3.6.1-1pQpHwWyWRWKJTeRlrZZA0) ghc-devel(http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6) ghc-devel(mtl-2.2.2) ghc-devel(resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv) ghc-devel(transformers-0.5.6.2) ghc-devel(unliftio-core-0.2.1.0-AEtYfdyUWlJCLfz2d4hPbj) ghc-http-conduit"

inherit rpm
