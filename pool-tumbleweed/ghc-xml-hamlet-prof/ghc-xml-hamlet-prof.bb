SUMMARY = "Haskell xml-hamlet profiling library"
DESCRIPTION = "This package provides the Haskell xml-hamlet profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.2"

RPM_NAME = "ghc-xml-hamlet-prof-0.5.0.2-2.10.aarch64.rpm"
RPM_HASH = "3fbd7fc86c839ee4fa8ff3ca4cae6beb1c54af9b935a12dd63e74146acd89e1e615367fb5fdcbf2d6b3aced3a834d37a6a8a8bd5eb6bea5484bd10b94ae81cda"

RPROVIDES:${PN} += "ghc-prof-xml-hamlet-0.5.0.2-BIJLiWudoZBIDguCKDu3nu \
ghc-xml-hamlet-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-shakespeare-2.0.30-5XHeuGt8JLJENvL2Ahdhem \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-text-2.0.2 \
ghc-prof-xml-conduit-1.9.1.3-2cOMN3SNzhLD8DxEiNBrwq \
ghc-xml-hamlet-devel"

inherit rpm
