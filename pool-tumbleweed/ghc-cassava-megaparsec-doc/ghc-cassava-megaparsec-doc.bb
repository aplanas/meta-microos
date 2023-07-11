SUMMARY = "Haskell cassava-megaparsec library documentation"
DESCRIPTION = "This package provides the Haskell cassava-megaparsec library documentation."
LICENSE = "MIT"

PV = "2.0.4"

RPM_NAME = "ghc-cassava-megaparsec-doc-2.0.4-3.3.noarch.rpm"
RPM_HASH = "25c68ab647741336c3996f0d8d35c549e0a7b1a71be069acd3c154023a6c810642c8dd226252ffce3d84b7c27fc48247b57c1cf814d021169ff8d67212d667f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cassava-megaparsec-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
