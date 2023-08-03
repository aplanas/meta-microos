SUMMARY = "Documentation for texlive-tikzinclude"
DESCRIPTION = "This package includes the documentation for texlive-tikzinclude"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn28715"

RPM_NAME = "texlive-tikzinclude-doc-2023.209.1.0svn28715-53.1.noarch.rpm"
RPM_HASH = "419a36b9a7ede4f31ba3ea2092228fa3c42595a524c68401c4df628a847b713c9287872a66ef3b77f612ea7b98dfdea9334ddbcbea20b8a85c0b8a88999cb1c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzinclude-doc"

RDEPENDS:${PN} += ""

inherit rpm
