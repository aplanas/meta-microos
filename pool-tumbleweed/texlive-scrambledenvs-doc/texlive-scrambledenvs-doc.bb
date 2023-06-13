SUMMARY = "Documentation for texlive-scrambledenvs"
DESCRIPTION = "This package includes the documentation for texlive-scrambledenvs"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.0svn60615"

RPM_NAME = "texlive-scrambledenvs-doc-2023.201.1.1.0svn60615-53.1.noarch.rpm"
RPM_HASH = "b8af6ddf4e86a66ae3cf3497c9826ee33820b9c01cfce38ecfd7884984d31f285275cc13e2349722d0b0a742bb10f608fd7939fc352cc7297e14808dc62a5b55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scrambledenvs-doc"

RDEPENDS:${PN} += ""

inherit rpm
