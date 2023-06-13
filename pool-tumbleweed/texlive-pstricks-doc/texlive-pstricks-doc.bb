SUMMARY = "Documentation for texlive-pstricks"
DESCRIPTION = "This package includes the documentation for texlive-pstricks"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.18svn65346"

RPM_NAME = "texlive-pstricks-doc-2023.201.3.18svn65346-53.1.noarch.rpm"
RPM_HASH = "a27f1a9592713316e51e487e3e4063c4be6ba3eb9dd9bcddca8128644ec1db8890bc94dbc63d5018e8672fcc55541dcabeabef7422d22595787a1a5d884621db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pstricks-doc"

RDEPENDS:${PN} += ""

inherit rpm
