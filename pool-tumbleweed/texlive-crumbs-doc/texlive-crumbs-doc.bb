SUMMARY = "Documentation for texlive-crumbs"
DESCRIPTION = "This package includes the documentation for texlive-crumbs"
LICENSE = "LPPL-1.0"

PV = "2023.204.0.0.4.1svn64602"

RPM_NAME = "texlive-crumbs-doc-2023.204.0.0.4.1svn64602-54.1.noarch.rpm"
RPM_HASH = "20ea659c5c8cdc2fe59635bb56f93d63d5b5d4df971aca5044470e368db6453c61fb51609509ae28092c5a705829ae90bfa326372dd0719aba6f68979253b547"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-crumbs-doc"
RDEPENDS:${PN} += ""

inherit rpm
