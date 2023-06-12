SUMMARY = "Documentation for texlive-bfh-ci"
DESCRIPTION = "This package includes the documentation for texlive-bfh-ci"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1.5svn66461"

RPM_NAME = "texlive-bfh-ci-doc-2023.201.2.1.5svn66461-53.1.noarch.rpm"
RPM_HASH = "9bd9c02f66df0cd863d6f43fbbace2431ea1a0ae3ce9bdaa98759afd92091c8d048df8ca87fe4522d4cabc88568b5a532505c5f8e1a683c7cb87f12b8386cd4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bfh-ci-doc"
RDEPENDS:${PN} += ""

inherit rpm
