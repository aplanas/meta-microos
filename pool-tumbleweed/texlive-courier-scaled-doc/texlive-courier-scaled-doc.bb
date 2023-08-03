SUMMARY = "Documentation for texlive-courier-scaled"
DESCRIPTION = "This package includes the documentation for texlive-courier-scaled"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn24940"

RPM_NAME = "texlive-courier-scaled-doc-2023.209.svn24940-55.1.noarch.rpm"
RPM_HASH = "2733557bd10e559c9ec10c63173034e1e920898aa11335f7dc8afa083aeeef58c19265e11f4abcae0a8772dbc1ef6bcb52610c4ace1564e9550b3ea05103b4d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-courier-scaled-doc"

RDEPENDS:${PN} += ""

inherit rpm
