SUMMARY = "Documentation for texlive-fancyhandout"
DESCRIPTION = "This package includes the documentation for texlive-fancyhandout"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn46411"

RPM_NAME = "texlive-fancyhandout-doc-2023.201.svn46411-52.1.noarch.rpm"
RPM_HASH = "24ae5b8b977938689b9e1568e3db10e43ce478cbbe52db0371b55337f83707f15c71ad35cfdde1a3bd0cb7ee374f1c6a6b162cd3e0d69a38b88f602549fa7a5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fancyhandout-doc"

RDEPENDS:${PN} += ""

inherit rpm
