SUMMARY = "Documentation for texlive-grayhints"
DESCRIPTION = "This package includes the documentation for texlive-grayhints"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn49052"

RPM_NAME = "texlive-grayhints-doc-2023.209.svn49052-54.1.noarch.rpm"
RPM_HASH = "5734aba0e04e04a3eaec30b7a1916c2a6667f768edd168a7577ed22f32a1ab0c154c1197189f97753e96ccd1eeb38a1013ecec67deade7031bf33db25b21fd2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grayhints-doc"

RDEPENDS:${PN} += ""

inherit rpm
