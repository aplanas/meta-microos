SUMMARY = "Haskell unicode-data library documentation"
DESCRIPTION = "This package provides the Haskell unicode-data library documentation."
LICENSE = "Apache-2.0"

PV = "0.4.0.1"

RPM_NAME = "ghc-unicode-data-doc-0.4.0.1-3.6.noarch.rpm"
RPM_HASH = "8fb09091accf31d2af5f672560824ec0217abaf504ea3aa8c11a7f76feeba572a432ffc05e363dfa44e511f97e6b6351b1afafc401a87d5b383b0934f6e43488"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-unicode-data-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
