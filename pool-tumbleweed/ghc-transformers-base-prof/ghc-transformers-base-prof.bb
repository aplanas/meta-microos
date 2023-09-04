SUMMARY = "Haskell transformers-base profiling library"
DESCRIPTION = "This package provides the Haskell transformers-base profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.6"

RPM_NAME = "ghc-transformers-base-prof-0.4.6-2.3.aarch64.rpm"
RPM_HASH = "998b0e1e13b5c7a93b734519a2bb65623aaf4268185d087395f84ea66440093ac1dd4027a651cc7e405b1d90e8317525c7bd28ba2c740a5ff01d7ae651a3a9c4"

RPROVIDES:${PN} += "ghc-prof-transformers-base-0.4.6-FmWhyTNhU3u3qYTd28DG44 \
ghc-transformers-base-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-base-orphans-0.8.8.2-Ace67bhQsJ1lQVihVIKZ5 \
ghc-prof-stm-2.5.1.0 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-transformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM \
ghc-transformers-base-devel"

inherit rpm
