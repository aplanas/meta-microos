SUMMARY = "Haskell csv profiling library"
DESCRIPTION = "This package provides the Haskell csv profiling library."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "ghc-csv-prof-0.1.2-4.3.aarch64.rpm"
RPM_HASH = "8423c19b3b287c3022771eeb389ca56ad2497f2a5884cbf61bce6604d363af91fe181c57a5987067a198c6a97da325d581e505da3e212591129200ca36a14489"

RPROVIDES:${PN} += "ghc-csv-prof \
ghc-prof-csv-0.1.2-D7ZtQLgQlciDV3aF4oWKCf"

RDEPENDS:${PN} += "ghc-csv-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-parsec-3.1.16.1"

inherit rpm
