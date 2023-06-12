SUMMARY = "Documentation for texlive-psfrag"
DESCRIPTION = "This package includes the documentation for texlive-psfrag"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.04svn15878"

RPM_NAME = "texlive-psfrag-doc-2023.201.3.04svn15878-52.1.noarch.rpm"
RPM_HASH = "2fb982d0c1caa55ed237e8a01b564c230cb10dd98ec2cefb97b61b04403ae450b62a971934e1d532c10fcc43f3990bb13d53f75643b4f84cdcb9b4f43430d72b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-psfrag-doc:en) \
texlive-psfrag-doc"
RDEPENDS:${PN} += ""

inherit rpm
