SUMMARY = "Documentation for texlive-zhlipsum"
DESCRIPTION = "This package includes the documentation for texlive-zhlipsum"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2.0svn54994"

RPM_NAME = "texlive-zhlipsum-doc-2023.201.1.2.0svn54994-52.2.noarch.rpm"
RPM_HASH = "9d7082029b77e879aa50440e2d9c416d556e6ad0cbd51f770395d56406229fd88710430951a5543952b9226f90c9aa930995636ac449c097f78b89bd6ea3c061"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-zhlipsum-doc-en;zh \
texlive-zhlipsum-doc"

RDEPENDS:${PN} += ""

inherit rpm
