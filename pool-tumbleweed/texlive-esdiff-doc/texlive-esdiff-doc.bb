SUMMARY = "Documentation for texlive-esdiff"
DESCRIPTION = "This package includes the documentation for texlive-esdiff"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn21385"

RPM_NAME = "texlive-esdiff-doc-2023.201.1.2svn21385-53.2.noarch.rpm"
RPM_HASH = "4071ca8cb60d0381842ba751bb7f08d93ab5abe3acfdc37c2bfab6d5d92c6ef5505ca7f9fd453deb8eb592d3cb6a4bbcead09318d4f9bce3cb7159d92f2ac6ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-esdiff-doc"

RDEPENDS:${PN} += ""

inherit rpm
