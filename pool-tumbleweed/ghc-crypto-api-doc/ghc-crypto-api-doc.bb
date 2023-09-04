SUMMARY = "Haskell crypto-api library documentation"
DESCRIPTION = "This package provides the Haskell crypto-api library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.13.3"

RPM_NAME = "ghc-crypto-api-doc-0.13.3-5.9.noarch.rpm"
RPM_HASH = "ad3fe4813435c370c63e80b1d21d1a7efb9ac92e8fce1cec1812cd6c9128895aaf4bd566556994cb926af9a96cd9e069c4253b45f66f34422a122fe034c429c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-crypto-api-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
