SUMMARY = "Haskell torrent library documentation"
DESCRIPTION = "This package provides the Haskell torrent library documentation."
LICENSE = "BSD-3-Clause"

PV = "10000.1.3"

RPM_NAME = "ghc-torrent-doc-10000.1.3-1.6.noarch.rpm"
RPM_HASH = "efe2eb6d93bf44d08999769e611a54c5f9a4be5b1957dbc8a1d45332437a33a4ff6864b5053fa0002b852372d05ef5749c439b7b4d6dd21b7975247f8d8f2dc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-torrent-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
