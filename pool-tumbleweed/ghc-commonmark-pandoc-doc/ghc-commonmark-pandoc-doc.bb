SUMMARY = "Haskell commonmark-pandoc library documentation"
DESCRIPTION = "This package provides the Haskell commonmark-pandoc library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.1.3"

RPM_NAME = "ghc-commonmark-pandoc-doc-0.2.1.3-2.4.noarch.rpm"
RPM_HASH = "a3a1517d589b72044cdded7e239e9cda817da0f8760b02d499443c62c017b1f0c8b17a4db7fc43d41183cf181a2fdd36a5c64ba7dcb9649c0cb28f944bb5bb8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-commonmark-pandoc-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
