SUMMARY = "Documentation for texlive-abstyles"
DESCRIPTION = "This package includes the documentation for texlive-abstyles"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-abstyles-doc-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "2a5cc39c2b3122e1f1b7e6017e06bc8f858d7c916615fdc63b0ee0785ade71dea929e6367306ec63755f08ccaff1638c0e44fc718f3828d3bd857e3fe943cb2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-abstyles-doc:de) \
texlive-abstyles-doc"

RDEPENDS:${PN} += ""

inherit rpm
