SUMMARY = "Documentation for texlive-meetingmins"
DESCRIPTION = "This package includes the documentation for texlive-meetingmins"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.6svn31878"

RPM_NAME = "texlive-meetingmins-doc-2023.208.1.6svn31878-53.1.noarch.rpm"
RPM_HASH = "d932b860ea56050025338ea5e0d90742da17399c2ea3ff9cdd0d9f813206575717cbb7023b9e25043c38911a93533aa06a6ad69d9f898b20d2ae734803076366"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-meetingmins-doc"

RDEPENDS:${PN} += ""

inherit rpm
