SUMMARY = "Documentation for texlive-bubblesort"
DESCRIPTION = "This package includes the documentation for texlive-bubblesort"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn56070"

RPM_NAME = "texlive-bubblesort-doc-2023.201.1.0svn56070-52.1.noarch.rpm"
RPM_HASH = "d981462ed740fd5e9f454068d46172f983c516c6f94f47f026e8090edb8992a902b92bbcd93a6084c10533f43276a8030223e71897513811c0af74c4d8342fe2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bubblesort-doc"

RDEPENDS:${PN} += ""

inherit rpm
