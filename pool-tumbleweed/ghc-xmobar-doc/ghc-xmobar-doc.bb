SUMMARY = "Haskell xmobar library documentation"
DESCRIPTION = "This package provides the Haskell xmobar library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.46"

RPM_NAME = "ghc-xmobar-doc-0.46-2.12.noarch.rpm"
RPM_HASH = "9eb10c9f7a0bb5e4e33282b9c682160e58e723f803f0fed6a7dde9522fa19e0fe5d92dbe1b3fe6aae1dd3de3f4e31e214f0ec05029c8a26e86058bb1dd6a44f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-xmobar-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
