SUMMARY = "Documentation for texlive-pst-vowel"
DESCRIPTION = "This package includes the documentation for texlive-pst-vowel"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn25228"

RPM_NAME = "texlive-pst-vowel-doc-2023.201.1.0svn25228-53.2.noarch.rpm"
RPM_HASH = "947008220ab5035f096b8b33dbd65d6d759e781344dcd6e35c15864ccd93c594e0da569f3801a639bdd1066f84b7b5fef55bec8ffc71e60145f960f35a530b77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-vowel-doc"

RDEPENDS:${PN} += ""

inherit rpm
