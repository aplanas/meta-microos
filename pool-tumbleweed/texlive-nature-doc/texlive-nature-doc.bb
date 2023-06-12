SUMMARY = "Documentation for texlive-nature"
DESCRIPTION = "This package includes the documentation for texlive-nature"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn21819"

RPM_NAME = "texlive-nature-doc-2023.201.1.0svn21819-54.1.noarch.rpm"
RPM_HASH = "16c4818f1f171afa9429de19bfb44bac55055a1053c9fb7b324b0b07f8447a204321d6de28f81a62d60a0efecef6dde228ffe4aa824b9ea7bed8d501dc9117f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nature-doc"
RDEPENDS:${PN} += ""

inherit rpm
