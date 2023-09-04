SUMMARY = "Haskell xml-hamlet profiling library"
DESCRIPTION = "This package provides the Haskell xml-hamlet profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.2"

RPM_NAME = "ghc-xml-hamlet-prof-0.5.0.2-2.9.aarch64.rpm"
RPM_HASH = "af0fcd754940bfe36725e37d88f689c6c2f8ccb6ed7c5190b10a282c52ea71c569c378f964f8e94409ef3ab7352508335cd02e7ce044850c75688e473e4d1db1"

RPROVIDES:${PN} += "ghc-prof-xml-hamlet-0.5.0.2-DXz2ffvxE9vxmXJYBmXu \
ghc-xml-hamlet-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-shakespeare-2.0.30-GrImIeltjQZ7T3c163uEiZ \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-text-2.0.2 \
ghc-prof-xml-conduit-1.9.1.3-DDoR4rlzTH6QSHmFsTVd9 \
ghc-xml-hamlet-devel"

inherit rpm
