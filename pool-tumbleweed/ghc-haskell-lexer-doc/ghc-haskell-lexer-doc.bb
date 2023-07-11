SUMMARY = "Haskell haskell-lexer library documentation"
DESCRIPTION = "This package provides the Haskell haskell-lexer library documentation."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "ghc-haskell-lexer-doc-1.1.1-2.6.noarch.rpm"
RPM_HASH = "a916c003f0b3a0fd58c61cd1317cdf8416f6f3ae4e2323a7031074f026ad45c683d35ef10d4a1423a0c7b426e0a87ad1d752c8b7c0a277325a8a45e3d6deb28a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-haskell-lexer-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
