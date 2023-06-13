SUMMARY = "Haskell commonmark-extensions library documentation"
DESCRIPTION = "This package provides the Haskell commonmark-extensions library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.3.4"

RPM_NAME = "ghc-commonmark-extensions-doc-0.2.3.4-1.3.noarch.rpm"
RPM_HASH = "e49e9060d79281d4527c98cb75fb091cb1f59f1a613e9937e1e5ef2d5ab6d920b59c727ff7f3bd952cb9dda4f05547f35ea36232909cda5ee5e0ff8eaca0814b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-commonmark-extensions-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
