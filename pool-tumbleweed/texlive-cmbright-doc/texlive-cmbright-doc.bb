SUMMARY = "Documentation for texlive-cmbright"
DESCRIPTION = "This package includes the documentation for texlive-cmbright"
LICENSE = "LPPL-1.0"

PV = "2023.209.8.1svn21107"

RPM_NAME = "texlive-cmbright-doc-2023.209.8.1svn21107-54.1.noarch.rpm"
RPM_HASH = "53cbc5ffd94ff4deef9062d05f8c9034a8efb9d57716bf874ff099e6e41b255b6d0d70bd6ec42c927b99c2286ee148e4285925f77a601f42c93d9b590bfba1ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cmbright-doc"

RDEPENDS:${PN} += ""

inherit rpm
