SUMMARY = "Haskell pandoc-server library documentation"
DESCRIPTION = "This package provides the Haskell pandoc-server library documentation."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.0.1"

RPM_NAME = "ghc-pandoc-server-doc-0.1.0.1-1.3.noarch.rpm"
RPM_HASH = "62adff5c06facce19c6b0281370d266b1815b317fc9178963c93c677455a832e2bd5837daeded606016d5b7999c73ca8ced9ce08e91208528896baaee7c77f48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pandoc-server-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
