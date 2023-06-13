SUMMARY = "Documentation for texlive-sansmath"
DESCRIPTION = "This package includes the documentation for texlive-sansmath"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.1svn17997"

RPM_NAME = "texlive-sansmath-doc-2023.201.1.1svn17997-53.1.noarch.rpm"
RPM_HASH = "dfddd60b1b0b3f31ce96c99e3ecddc4c86e691aae9575dd8238dcef5f5109705fc988259c108438a14f9287d0187e9563ad62e302cc312f985492127818048ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sansmath-doc"

RDEPENDS:${PN} += ""

inherit rpm
