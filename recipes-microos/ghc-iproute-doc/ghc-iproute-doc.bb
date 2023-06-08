SUMMARY = "Haskell iproute library documentation"
DESCRIPTION = "This package provides the Haskell iproute library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.7.12"

RPM_NAME = "ghc-iproute-doc-1.7.12-2.3.noarch.rpm"
RPM_HASH = "d4affb4c855670c3a4e9c5d5c93c365e8f42e7ce291a34aefdef00980733033e9bf03e11194a7145a66e5a28ee73782b7f8f98ceb32829ae2b22f0ef79576418"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-iproute-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
