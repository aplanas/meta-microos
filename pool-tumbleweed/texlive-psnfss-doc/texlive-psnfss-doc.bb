SUMMARY = "Documentation for texlive-psnfss"
DESCRIPTION = "This package includes the documentation for texlive-psnfss"
LICENSE = "LPPL-1.0"

PV = "2023.201.9.3svn54694"

RPM_NAME = "texlive-psnfss-doc-2023.201.9.3svn54694-52.1.noarch.rpm"
RPM_HASH = "483da3342de5660fe6b394113e2f56f6b18c770d47695cc89b8fb45003b3d40dcf1131a838a2d47d7867b5be918057a7ec9edb2ec8780775107a426bb6babcfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-psnfss-doc"

RDEPENDS:${PN} += ""

inherit rpm
