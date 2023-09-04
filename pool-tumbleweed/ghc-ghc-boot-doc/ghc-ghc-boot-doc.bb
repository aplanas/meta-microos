SUMMARY = "Haskell ghc-boot library documentation"
DESCRIPTION = "This package provides the Haskell ghc-boot library documentation."
LICENSE = "BSD-3-Clause"

PV = "9.4.6"

RPM_NAME = "ghc-ghc-boot-doc-9.4.6-1.1.noarch.rpm"
RPM_HASH = "5f7295986318faf694deb70824a71675df6ba74aa601fd1ec986bd62bf71e57805b418222824c21e5f16820d37ff7ddde8db558f893c3e4f27150cbc3b0f4b30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ghc-boot-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
