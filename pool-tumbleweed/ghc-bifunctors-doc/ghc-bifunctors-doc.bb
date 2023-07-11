SUMMARY = "Haskell bifunctors library documentation"
DESCRIPTION = "This package provides the Haskell bifunctors library documentation."
LICENSE = "BSD-2-Clause"

PV = "5.5.15"

RPM_NAME = "ghc-bifunctors-doc-5.5.15-1.6.noarch.rpm"
RPM_HASH = "238cffef3c6a2a451085d1ab24349ebd36f73b1bd0c6a706e375591e21616ba330c70c824546ef4ef3ef782158e10ece6f503c41524d3fbdcf16b5f97e700880"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-bifunctors-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
