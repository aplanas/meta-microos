SUMMARY = "Haskell lucid library documentation"
DESCRIPTION = "This package provides the Haskell lucid library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.11.20230408"

RPM_NAME = "ghc-lucid-doc-2.11.20230408-1.3.noarch.rpm"
RPM_HASH = "c5cca80f77090dd1dc9be9cf3a7a50c6e37dfdf21dfb3cb19e7df85171f3ed8d3d86e195d668de5d5e4c4114ab2822f60db6e974a9c7008783d3159fafde59cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-lucid-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
