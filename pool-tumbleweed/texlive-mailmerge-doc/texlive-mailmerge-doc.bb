SUMMARY = "Documentation for texlive-mailmerge"
DESCRIPTION = "This package includes the documentation for texlive-mailmerge"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-mailmerge-doc-2023.201.1.0svn15878-52.1.noarch.rpm"
RPM_HASH = "088bddadb8ec2561a9b219be5865d9ffdd701b687ed88260a2802c4383d091de5f5f2e7ae2ce5ba91f7764dd4ff19338b43e3b5c4a4c9da8fdd0362f75d0851e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mailmerge-doc"

RDEPENDS:${PN} += ""

inherit rpm
