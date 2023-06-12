SUMMARY = "Documentation for texlive-celtic"
DESCRIPTION = "This package includes the documentation for texlive-celtic"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn39797"

RPM_NAME = "texlive-celtic-doc-2023.201.1.1svn39797-52.1.noarch.rpm"
RPM_HASH = "7b4a967f0942e1fe52b97e42a16567e0b3212487a0d1e3b98fac97389a43bdf8ac5c2287b7b77868fcd7483d46d737ed31af33a96ece935c7976da9768632418"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-celtic-doc"
RDEPENDS:${PN} += ""

inherit rpm
