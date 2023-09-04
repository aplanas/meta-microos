SUMMARY = "Haskell aws library documentation"
DESCRIPTION = "This package provides the Haskell aws library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.23"

RPM_NAME = "ghc-aws-doc-0.23-1.11.noarch.rpm"
RPM_HASH = "bf5abf5a811eb58381d48b8202bb38a4bc644a954bfb73c4207672709bb7dd2b60d0117756ef0831680ebb4e1edcd592906c4d794ec1a3d80f1b1121daa32717"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-aws-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
