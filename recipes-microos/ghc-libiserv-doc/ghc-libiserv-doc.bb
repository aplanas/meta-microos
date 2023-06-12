SUMMARY = "Haskell libiserv library documentation"
DESCRIPTION = "This package provides the Haskell libiserv library documentation."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-libiserv-doc-9.4.5-3.1.noarch.rpm"
RPM_HASH = "2524f7ea140fa05ee6f577c769dc079a86e9a2720f0c525fda5083f2d0db0b561b2d330154cd6541f93e1806714e0952bad3b1ba4694340adfcbdba31a8ae4af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-libiserv-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
