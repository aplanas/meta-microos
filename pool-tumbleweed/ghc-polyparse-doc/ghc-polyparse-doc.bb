SUMMARY = "Haskell polyparse library documentation"
DESCRIPTION = "This package provides the Haskell polyparse library documentation."
LICENSE = "LGPL-2.1-only"

PV = "1.13"

RPM_NAME = "ghc-polyparse-doc-1.13-11.1.noarch.rpm"
RPM_HASH = "bfe25bba6b22c7657f88bcbdfd3c64626c881892e669ec143a2fa148505d19b097f95621f82076f5427fcbe4d1bd64f9c0b1c096a3b4a2387d6906f8cef23384"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-polyparse-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
