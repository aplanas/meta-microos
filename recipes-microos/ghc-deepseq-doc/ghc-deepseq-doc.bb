SUMMARY = "Haskell deepseq library documentation"
DESCRIPTION = "This package provides the Haskell deepseq library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.4.8.0"

RPM_NAME = "ghc-deepseq-doc-1.4.8.0-1.1.noarch.rpm"
RPM_HASH = "3962e18fa9fea8b91ee4303e0aeaca9601c227d17a3cf03992f16c833f1961292ffc4d3b0fcde3ec39b97051a85c25fd5efa0482f5e1fc95e89e24b1fb0ee1d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-deepseq-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
