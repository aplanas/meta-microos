SUMMARY = "Haskell connection library documentation"
DESCRIPTION = "This package provides the Haskell connection library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "ghc-connection-doc-0.3.1-8.1.noarch.rpm"
RPM_HASH = "e4ad6e39d0bd0f9eb04154c842fdcef2b11ce20dd446b2ed4e46cb6046e3446afd639dfedc55f7696e0d5f75f582a593b377a8838c63ded034652b5b0b168187"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-connection-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
