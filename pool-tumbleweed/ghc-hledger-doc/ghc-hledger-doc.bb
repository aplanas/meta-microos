SUMMARY = "Haskell hledger library documentation"
DESCRIPTION = "This package provides the Haskell hledger library documentation."
LICENSE = "GPL-3.0-or-later"

PV = "1.28"

RPM_NAME = "ghc-hledger-doc-1.28-2.8.noarch.rpm"
RPM_HASH = "0086c7cdc0913d4e02da266d30cb303b44f9da2fb231a2f21115aa5a84a6fdc51ce1d5ba27f325ec866c9fabcf33c5484f0e1ec8a0c25a905e4aba865e896e93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hledger-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
