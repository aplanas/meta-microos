SUMMARY = "Haskell crypto-cipher-types library documentation"
DESCRIPTION = "This package provides the Haskell crypto-cipher-types library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.0.9"

RPM_NAME = "ghc-crypto-cipher-types-doc-0.0.9-4.3.noarch.rpm"
RPM_HASH = "a40875372e00daced1ab35a4276afcef1cdc3a5633ed190f1494ff12947031164540a76722b2db808ba41fbcd5f691bb4e4ca88967499d91839f37cb47fa3312"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-crypto-cipher-types-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
