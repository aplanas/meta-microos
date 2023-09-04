SUMMARY = "Haskell asn1-parse library documentation"
DESCRIPTION = "This package provides the Haskell asn1-parse library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.9.5"

RPM_NAME = "ghc-asn1-parse-doc-0.9.5-6.4.noarch.rpm"
RPM_HASH = "950d2ab29b5d9cbbb2cf91ec4ca9cd7d69b4d7d51be2ccffa5650e04b766ad1eb7c593fa0520d3ac1906f30c02a202ea7958ba646bfdae589b15c8b686221cdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-asn1-parse-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
