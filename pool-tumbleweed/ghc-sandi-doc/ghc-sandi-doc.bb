SUMMARY = "Haskell sandi library documentation"
DESCRIPTION = "This package provides the Haskell sandi library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5"

RPM_NAME = "ghc-sandi-doc-0.5-5.3.noarch.rpm"
RPM_HASH = "d94c9ce9f0b4a095a77d6ce744cda9d5b51adc2eee4acac591da043b3fe0f5da4a26aaeda1de81c5f7655134316ff802e78c31c6c3684d59c7ddfd1e8574eb90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-sandi-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
