SUMMARY = "Haskell skylighting-format-context profiling library"
DESCRIPTION = "This package provides the Haskell skylighting-format-context profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.2"

RPM_NAME = "ghc-skylighting-format-context-prof-0.1.0.2-1.11.aarch64.rpm"
RPM_HASH = "4c6a5cd3761a3a821f2af81026f760694282b15be278aa738ac380b5c05ca3483735229c6303d691287e8808a5ce01449abc9c97c9ba9deb7b49aa34e7da30cd"

RPROVIDES:${PN} += "ghc-prof-skylighting-format-context-0.1.0.2-4E6TECMrJ1JH7PHte3jxUC \
ghc-skylighting-format-context-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-skylighting-core-0.13.4.1-LOkep7AnSNN7QJDAXr031n \
ghc-prof-text-2.0.2 \
ghc-skylighting-format-context-devel"

inherit rpm
