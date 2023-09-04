SUMMARY = "Haskell magic library documentation"
DESCRIPTION = "This package provides the Haskell magic library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "ghc-magic-doc-1.1-4.8.noarch.rpm"
RPM_HASH = "5d3dcaa0ed58c01497179494488db18b598fa42d22075f3a23e7181e68e040d239f3a681d5b83543f2eebf8837d7e8d6e6b351434feb12c6feda5ff80a47dc6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-magic-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
