SUMMARY = "Haskell some library documentation"
DESCRIPTION = "This package provides the Haskell some library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.5"

RPM_NAME = "ghc-some-doc-1.0.5-1.8.noarch.rpm"
RPM_HASH = "997fa1f662a6be7d803f590f98b5315b67ccb77833881df36fc204dd220273fcd35af7a3141c698ed648adaf04894d73a125d1931becabc1b7287724c6dd859b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-some-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
