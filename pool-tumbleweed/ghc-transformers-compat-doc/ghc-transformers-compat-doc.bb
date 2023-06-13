SUMMARY = "Haskell transformers-compat library documentation"
DESCRIPTION = "This package provides the Haskell transformers-compat library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.7.2"

RPM_NAME = "ghc-transformers-compat-doc-0.7.2-2.3.noarch.rpm"
RPM_HASH = "5e4baca7b5fa073fa5620daf99003fb65081625a22758373b14486fa228a50cd961efa82481476a48189b418bb1056eff8632a87ad4a5acd353ab0f0aed425db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-transformers-compat-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
