SUMMARY = "Documentation for texlive-newpx"
DESCRIPTION = "This package includes the documentation for texlive-newpx"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.505svn61806"

RPM_NAME = "texlive-newpx-doc-2023.209.1.505svn61806-55.1.noarch.rpm"
RPM_HASH = "e55af43c4c1101be545ac8e7fb80ebb27996e11c6ca7cca3bd4b0178ee969a29eeeec8ee41486bdcff98e9dbd5e58d0264b0db12cad62fa03ae0d207f5782996"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-newpx-doc"

RDEPENDS:${PN} += ""

inherit rpm
