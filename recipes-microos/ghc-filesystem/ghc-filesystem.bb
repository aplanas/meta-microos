SUMMARY = "Shared directories for Haskell documentation"
DESCRIPTION = "This package provides some common directories used for \
Haskell libraries documentation."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-filesystem-9.4.5-1.1.noarch.rpm"
RPM_HASH = "685c6883b67c610c6b768baa739758d59f1f53b164f5a45f117e0886b11bfa9e417b02a08f6669b6c49b41cea5aa4ce11ff222ef9d44a264a8b05552765e397a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-filesystem"
RDEPENDS:${PN} += ""

inherit rpm
