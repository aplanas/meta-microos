SUMMARY = "Haskell hslua library documentation"
DESCRIPTION = "This package provides the Haskell hslua library documentation."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ghc-hslua-doc-2.3.0-1.3.noarch.rpm"
RPM_HASH = "8335a2b857bf5e4670c1d8b983be4700d55b3ac58b32c1fbbdc062c6298c9001a3fbb10cfca113fdf45fafe3871315f54a985e3909907883b46204e4aeaf75bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
