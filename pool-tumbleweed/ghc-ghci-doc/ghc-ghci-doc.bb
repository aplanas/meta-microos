SUMMARY = "Haskell ghci library documentation"
DESCRIPTION = "This package provides the Haskell ghci library documentation."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-ghci-doc-9.4.5-3.2.noarch.rpm"
RPM_HASH = "c7453039eae731653334a864842c364a69d45fcdbd93253acead60d2406c72990360db2603cc4c27ae595a6f04498cb1cf8dcfb1694eba0b6064d040aca6fa47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ghci-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
