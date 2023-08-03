SUMMARY = "Documentation for texlive-sides"
DESCRIPTION = "This package includes the documentation for texlive-sides"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-sides-doc-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "7183733f808d07c05ab9ad928cc151e5103bff942256a2a81fc4eade22dafa257a611a23bb1b2f5452e0407816671110dab9e0a7acd7894c22f8eae1c788babe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sides-doc"

RDEPENDS:${PN} += ""

inherit rpm
