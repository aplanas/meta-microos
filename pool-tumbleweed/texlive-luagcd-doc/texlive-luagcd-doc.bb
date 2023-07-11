SUMMARY = "Documentation for texlive-luagcd"
DESCRIPTION = "This package includes the documentation for texlive-luagcd"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.0svn65396"

RPM_NAME = "texlive-luagcd-doc-2023.208.1.0svn65396-53.1.noarch.rpm"
RPM_HASH = "3f4e4fe78640eccd5e734d824eed90c3e554472fc9cd18f63b1a6319e40dce11e60b6b3bbbc8a2e7a294a4e1e0cbd43a0d1c6f36a4a148d13ec2263c40a65e8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luagcd-doc"

RDEPENDS:${PN} += ""

inherit rpm
