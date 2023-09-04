SUMMARY = "Haskell th-lift library documentation"
DESCRIPTION = "This package provides the Haskell th-lift library documentation."
LICENSE = "(BSD-3-Clause | GPL-2.0-only)"

PV = "0.8.4"

RPM_NAME = "ghc-th-lift-doc-0.8.4-1.2.noarch.rpm"
RPM_HASH = "55c6cd432c0db08369d85ab6ae32ad53b6736f010b1ad0a0d9ffacdf74887c216e981c8908e5b20f5afafe26c5b3cd0a50665eb87fed91d400cc9381690de406"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-th-lift-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
