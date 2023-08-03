SUMMARY = "Documentation for texlive-hep-title"
DESCRIPTION = "This package includes the documentation for texlive-hep-title"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn64907"

RPM_NAME = "texlive-hep-title-doc-2023.209.1.1svn64907-54.1.noarch.rpm"
RPM_HASH = "af7c28912eec009718503ad0b44411fc6aa1176eb35630990195bbb7cc69edc5a4c78a8a215bffd02593bfb6103789723a4a6ce165f880e88919042d4dd8b227"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-title-doc"

RDEPENDS:${PN} += ""

inherit rpm
