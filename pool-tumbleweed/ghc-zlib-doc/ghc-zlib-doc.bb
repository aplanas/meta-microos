SUMMARY = "Haskell zlib library documentation"
DESCRIPTION = "This package provides the Haskell zlib library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.6.3.0"

RPM_NAME = "ghc-zlib-doc-0.6.3.0-2.6.noarch.rpm"
RPM_HASH = "bd0b17c43de9c5d89813703f2c3560d44bf6b41bc7349c33776b7b9a187163b5b8586541a63bf42e633524891c2196ddfeca371292510d7fc4a6a48b90779c1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-zlib-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
