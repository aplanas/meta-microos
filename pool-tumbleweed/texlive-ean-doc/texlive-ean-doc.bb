SUMMARY = "Documentation for texlive-ean"
DESCRIPTION = "This package includes the documentation for texlive-ean"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn20851"

RPM_NAME = "texlive-ean-doc-2023.201.svn20851-53.2.noarch.rpm"
RPM_HASH = "fa4047d10851dad87cf3564a00a4b6dc7c1315f88a142f11321bb05f248a21ef90611a7e7e45b60587845b0be5b858efb3ebd39dcb4c521dee7f93dda1c65137"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ean-doc"

RDEPENDS:${PN} += ""

inherit rpm
