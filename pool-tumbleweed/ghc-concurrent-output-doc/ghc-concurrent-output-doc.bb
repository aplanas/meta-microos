SUMMARY = "Haskell concurrent-output library documentation"
DESCRIPTION = "This package provides the Haskell concurrent-output library documentation."
LICENSE = "BSD-2-Clause"

PV = "1.10.19"

RPM_NAME = "ghc-concurrent-output-doc-1.10.19-1.1.noarch.rpm"
RPM_HASH = "d3b494d86c8137ce74071f4290927c8ccec265fa72c0f2bdaa7dd862a56c68418f3d5dff2fc9c851450d2c139afdaa96350b3145e073ce1a52093b304500300e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-concurrent-output-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
