SUMMARY = "Documentation for texlive-tabvar"
DESCRIPTION = "This package includes the documentation for texlive-tabvar"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.8svn63921"

RPM_NAME = "texlive-tabvar-doc-2023.209.1.8svn63921-55.1.noarch.rpm"
RPM_HASH = "4c4627c8b8256952e402c80f8dce77acb68d1924d778cb6c800d4ceaa6506afc715a53241d7ef7f727f203bd4d8038fa71360a8c20871bea7863ee423d9afa54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tabvar-doc-fr \
texlive-tabvar-doc"

RDEPENDS:${PN} += ""

inherit rpm
