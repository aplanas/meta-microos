SUMMARY = "Haskell skylighting-format-blaze-html library documentation"
DESCRIPTION = "This package provides the Haskell skylighting-format-blaze-html library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "ghc-skylighting-format-blaze-html-doc-0.1.1-2.4.noarch.rpm"
RPM_HASH = "90cdc636406f5bca5f963f87c12cc976fc31170aab0635b0b58af9ae885928039dbabbb123ac2c925a2d4b90a5bd6b67a1b50d479b0dbd1ff17af2eaa7819224"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-skylighting-format-blaze-html-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
