SUMMARY = "Documentation for texlive-pst-exa"
DESCRIPTION = "This package includes the documentation for texlive-pst-exa"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.06svn45289"

RPM_NAME = "texlive-pst-exa-doc-2023.201.0.0.06svn45289-52.1.noarch.rpm"
RPM_HASH = "b4080f8d1da7a4345624a282438025efdbbf979317d9dc9b51142dd3327a2e82b107b5cdac0773cc07c349c21b7fda92a6b8b9170531aa4c6ff01753f9f25ab7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-exa-doc"

RDEPENDS:${PN} += ""

inherit rpm
