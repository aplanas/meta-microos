SUMMARY = "Documentation for texlive-ascelike"
DESCRIPTION = "This package includes the documentation for texlive-ascelike"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3svn29129"

RPM_NAME = "texlive-ascelike-doc-2023.201.2.3svn29129-53.1.noarch.rpm"
RPM_HASH = "007c059ef240e97c7261d60d860d6700946e1dc7b1bb391e660a190bffacf41b7afe7a2732a66a69f3e24be20aff1a84aeea9e3cd6304b85d4cd91e4bf1da5f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ascelike-doc"
RDEPENDS:${PN} += ""

inherit rpm
