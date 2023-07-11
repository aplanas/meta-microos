SUMMARY = "Haskell colour profiling library"
DESCRIPTION = "This package provides the Haskell colour profiling library."
LICENSE = "MIT"

PV = "2.3.6"

RPM_NAME = "ghc-colour-prof-2.3.6-2.6.aarch64.rpm"
RPM_HASH = "028fe57bffe08cba558eef9aaa3a82c102749a7ec070a9bc1d62a57f056b8dec2d9e463c2d19523871eb3174c8f604b4d7bdd3907e90e3ce2b07d02bd550aad0"

RPROVIDES:${PN} += "ghc-colour-prof \
ghc-prof-colour-2.3.6-7jQe2xj5Lsa5MbX38iH7Ln"

RDEPENDS:${PN} += "ghc-colour-devel \
ghc-prof-base-4.17.1.0"

inherit rpm
