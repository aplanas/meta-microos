SUMMARY = "Documentation for texlive-glossaries-estonian"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-estonian"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn49928"

RPM_NAME = "texlive-glossaries-estonian-doc-2023.209.1.0svn49928-54.2.noarch.rpm"
RPM_HASH = "28830037e13850795d83a110e322173ac20c77c476e3d47dd18949a2bf2f9d10b9e48a0799a3cb43425c96b7562272e73f3819f1561fced4ead0b2cf44080948"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-estonian-doc"

RDEPENDS:${PN} += ""

inherit rpm
