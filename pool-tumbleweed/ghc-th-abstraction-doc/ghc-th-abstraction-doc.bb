SUMMARY = "Haskell th-abstraction library documentation"
DESCRIPTION = "This package provides the Haskell th-abstraction library documentation."
LICENSE = "ISC"

PV = "0.4.5.0"

RPM_NAME = "ghc-th-abstraction-doc-0.4.5.0-2.8.noarch.rpm"
RPM_HASH = "a3f3c3b61da916556d789f62495d3db22753cd4ea8735b4cafb38f3fe0edf883c1c3245747fbe124f124e45428bbc59a106c8281912fb8bb3331941deae98fdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-th-abstraction-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
