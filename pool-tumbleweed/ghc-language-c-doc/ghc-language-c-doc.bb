SUMMARY = "Haskell language-c library documentation"
DESCRIPTION = "This package provides the Haskell language-c library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.9.2"

RPM_NAME = "ghc-language-c-doc-0.9.2-2.6.noarch.rpm"
RPM_HASH = "e0bd1490999a981c2786e73aa6c05c9dd356fa54448443acaf46967019d94bc1832ef769bd4edca9c17b822af94aae5da9ca1abd86521f10c825d2a5c2246a16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-language-c-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
