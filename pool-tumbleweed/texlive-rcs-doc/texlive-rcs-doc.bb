SUMMARY = "Documentation for texlive-rcs"
DESCRIPTION = "This package includes the documentation for texlive-rcs"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-rcs-doc-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "243dbb06984b49d4b695ae3f76cfc3528e6bde7889558d31589b3450c3adf855da212a6bd7648c86084b18c2ed6e48aef1b268c7f6dc2892bbba4dfb6e98c59d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rcs-doc"

RDEPENDS:${PN} += ""

inherit rpm
