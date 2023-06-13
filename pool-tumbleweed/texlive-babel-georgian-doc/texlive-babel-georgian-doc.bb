SUMMARY = "Documentation for texlive-babel-georgian"
DESCRIPTION = "This package includes the documentation for texlive-babel-georgian"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2svn45864"

RPM_NAME = "texlive-babel-georgian-doc-2023.201.2.2svn45864-53.1.noarch.rpm"
RPM_HASH = "0b85f992cecaeefd75ad58836b89494c255f4e95372d2bfc8bccf4b0b47e6eec518932a721e4fffc7d8efb0283beef2d36709045910ce3518bf662f61d813329"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-georgian-doc"

RDEPENDS:${PN} += ""

inherit rpm
