SUMMARY = "Haskell aeson-pretty library documentation"
DESCRIPTION = "This package provides the Haskell aeson-pretty library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.8.10"

RPM_NAME = "ghc-aeson-pretty-doc-0.8.10-1.1.noarch.rpm"
RPM_HASH = "b526e3ad2900c65c452a7f4d958f997b8d1777a49599f5d195dd7a5800a2d07e06a0c64019b48175b3afc888af3ad828cc4bb81bf45689729c561dfdb5388a33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-aeson-pretty-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
