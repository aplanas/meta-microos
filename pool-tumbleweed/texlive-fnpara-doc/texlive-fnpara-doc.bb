SUMMARY = "Documentation for texlive-fnpara"
DESCRIPTION = "This package includes the documentation for texlive-fnpara"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn25607"

RPM_NAME = "texlive-fnpara-doc-2023.209.svn25607-53.1.noarch.rpm"
RPM_HASH = "4a4943ff04f8c40e940dfdf9653590f899e5f98113c6de21cf1b51d2ccf66c2405be73db291b1b50895e403d1ac78685479c9717532867fbe035c18a9399670d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fnpara-doc"

RDEPENDS:${PN} += ""

inherit rpm
