SUMMARY = "Haskell OneTuple library documentation"
DESCRIPTION = "This package provides the Haskell OneTuple library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.1"

RPM_NAME = "ghc-OneTuple-doc-0.4.1.1-1.4.noarch.rpm"
RPM_HASH = "cc060a7f68a5a88bc543eb2e0c4e5da0b1bc015d1b01c22dd0acaef892885bce04ea0ec12ea89eb6e9d56948ecb9463d4f1b3e197137871a47d5cc46b48108cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-OneTuple-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
