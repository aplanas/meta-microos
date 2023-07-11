SUMMARY = "Documentation for texlive-gofonts"
DESCRIPTION = "This package includes the documentation for texlive-gofonts"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn64358"

RPM_NAME = "texlive-gofonts-doc-2023.201.svn64358-53.2.noarch.rpm"
RPM_HASH = "9b1f52917529b7e18c669b0b8158a85f01556319d5f29c431680c683bf39f366881dc1b8f45dd50a96f7cbe52b71359cd21bfb78f63ec88430805dd5c85eab7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gofonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
