SUMMARY = "Documentation for texlive-susy"
DESCRIPTION = "This package includes the documentation for texlive-susy"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn19440"

RPM_NAME = "texlive-susy-doc-2023.201.svn19440-57.1.noarch.rpm"
RPM_HASH = "8528bde4551d6c364af4b2266dce666b751d83707bbf981ab5fbebab137324d9b8f52f4773ef3247e895e1c0a934ad2ecf55b396159603b09c566e93943f4e6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-susy-doc"

RDEPENDS:${PN} += ""

inherit rpm
