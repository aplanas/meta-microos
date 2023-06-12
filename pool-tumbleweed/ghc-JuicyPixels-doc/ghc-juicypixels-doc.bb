SUMMARY = "Haskell JuicyPixels library documentation"
DESCRIPTION = "This package provides the Haskell JuicyPixels library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.3.8"

RPM_NAME = "ghc-JuicyPixels-doc-3.3.8-1.3.noarch.rpm"
RPM_HASH = "64d85973a7d625b41ee77b4f1587c19e9a0a976e46c64f229660f8bc7de68306f8f229a1d2db951478ea0c9a23d31283e3557b7a3fece572f020a784520c1ede"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-JuicyPixels-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
