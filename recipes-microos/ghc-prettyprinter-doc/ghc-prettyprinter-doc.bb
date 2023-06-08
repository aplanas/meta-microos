SUMMARY = "Haskell prettyprinter library documentation"
DESCRIPTION = "This package provides the Haskell prettyprinter library documentation."
LICENSE = "BSD-2-Clause"

PV = "1.7.1"

RPM_NAME = "ghc-prettyprinter-doc-1.7.1-2.2.noarch.rpm"
RPM_HASH = "27cdca318b174613be8b7404d742fda3f3bbb1c8ebbfec946a4f79b8416b6559de41a3c28ce284181587f8b8eebbd2a5a8bec6d74028e5eaaf49676c754e79d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-prettyprinter-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
