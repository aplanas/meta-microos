SUMMARY = "Haskell cassava-megaparsec library documentation"
DESCRIPTION = "This package provides the Haskell cassava-megaparsec library documentation."
LICENSE = "MIT"

PV = "2.0.4"

RPM_NAME = "ghc-cassava-megaparsec-doc-2.0.4-3.2.noarch.rpm"
RPM_HASH = "dfe85c48a9f77971f8ddf71c87e1556e3db38dcf5d189abb01ac9c0d7de20737e5023c9cc68be4cbfec208681080cc5add69e5dcf02dd22b882f8544188b7bc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cassava-megaparsec-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
