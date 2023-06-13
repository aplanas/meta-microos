SUMMARY = "Documentation for texlive-gotoh"
DESCRIPTION = "This package includes the documentation for texlive-gotoh"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn44764"

RPM_NAME = "texlive-gotoh-doc-2023.201.1.1svn44764-53.1.noarch.rpm"
RPM_HASH = "c0666b0668a128e63b040ce8eaeae7b55eac64f74e2cb4e4de9e2f2ee447cadc0669a3ee6f0798da279f32a32491135223184dd3ba908086200b8fa792cfe2e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gotoh-doc"

RDEPENDS:${PN} += ""

inherit rpm
