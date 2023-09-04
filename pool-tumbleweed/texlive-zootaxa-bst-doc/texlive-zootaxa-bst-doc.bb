SUMMARY = "Documentation for texlive-zootaxa-bst"
DESCRIPTION = "This package includes the documentation for texlive-zootaxa-bst"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn50619"

RPM_NAME = "texlive-zootaxa-bst-doc-2023.209.1.0svn50619-53.2.noarch.rpm"
RPM_HASH = "676903c844262b18900ef10b67976609b3936a9c7b16c33060cd2f3eb83ba7454d9d5b58168f134cabbfbc3a94158f9ab88f088f997bdbf667a5aac916dcd0c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zootaxa-bst-doc"

RDEPENDS:${PN} += ""

inherit rpm
