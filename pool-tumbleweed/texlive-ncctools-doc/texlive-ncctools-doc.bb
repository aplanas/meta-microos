SUMMARY = "Documentation for texlive-ncctools"
DESCRIPTION = "This package includes the documentation for texlive-ncctools"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.5.3svn51810"

RPM_NAME = "texlive-ncctools-doc-2023.201.3.5.3svn51810-54.1.noarch.rpm"
RPM_HASH = "aa63aded496f83fc0b61565a16b15bccf7e322bf24686f26662f486b41df69cd1e0917170e29ecc3d34896c6bce7d6d8c78eff16a964625671e62de60675acff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ncctools-doc"

RDEPENDS:${PN} += ""

inherit rpm
