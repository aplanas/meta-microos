SUMMARY = "Documentation for texlive-eledmac"
DESCRIPTION = "This package includes the documentation for texlive-eledmac"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.24.12svn45418"

RPM_NAME = "texlive-eledmac-doc-2023.201.1.24.12svn45418-53.1.noarch.rpm"
RPM_HASH = "cd4f0de8b2e8eb0cbe787661a3c0a2fd0498005f07a731b620774105b84d3ee3db7ce13bfc096ab0580a36ceaba1b0eb3e1f4d483f1920547deca813581aed4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eledmac-doc"

RDEPENDS:${PN} += ""

inherit rpm
