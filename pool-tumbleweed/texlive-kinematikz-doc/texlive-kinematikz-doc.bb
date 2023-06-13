SUMMARY = "Documentation for texlive-kinematikz"
DESCRIPTION = "This package includes the documentation for texlive-kinematikz"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn61392"

RPM_NAME = "texlive-kinematikz-doc-2023.201.1.0svn61392-55.1.noarch.rpm"
RPM_HASH = "ff5173cd01b44925b1676eaead9cad1d9226d24ced1686f98fd6885d4bf30d8c998e96a3e85d748855b025312ccbbd45bdcd5e376cbbdd9bb0cabd6ee1d9658a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kinematikz-doc"

RDEPENDS:${PN} += ""

inherit rpm
