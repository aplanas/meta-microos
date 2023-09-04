SUMMARY = "Haskell distributive profiling library"
DESCRIPTION = "This package provides the Haskell distributive profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.6.2.1"

RPM_NAME = "ghc-distributive-prof-0.6.2.1-3.4.aarch64.rpm"
RPM_HASH = "67eaa64c2d3052b75a0223ebd6777f25f9abdeb3fe96b71f150bd24940c52ff95a10a10ac53f9ef29d046dfc7ae1158de946e0956804b4b031494cc69aa81855"

RPROVIDES:${PN} += "ghc-distributive-prof \
ghc-prof-distributive-0.6.2.1-7gHlNDSCz3vFkde299iroS"

RDEPENDS:${PN} += "ghc-distributive-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-base-orphans-0.8.8.2-Ace67bhQsJ1lQVihVIKZ5 \
ghc-prof-tagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax \
ghc-prof-transformers-0.5.6.2"

inherit rpm
