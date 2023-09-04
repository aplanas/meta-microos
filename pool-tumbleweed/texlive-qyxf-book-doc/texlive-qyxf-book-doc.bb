SUMMARY = "Documentation for texlive-qyxf-book"
DESCRIPTION = "This package includes the documentation for texlive-qyxf-book"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.1.0svn56319"

RPM_NAME = "texlive-qyxf-book-doc-2023.209.3.1.0svn56319-54.2.noarch.rpm"
RPM_HASH = "4487cb78b939073f480242fd56396233ccda1fba30d27d76bec3a8d73ac890fb414ca58203d8264bd79957f9c031da0d69ed96c05ef9b10a29544235a89ddb8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-qyxf-book-doc-zh \
texlive-qyxf-book-doc"

RDEPENDS:${PN} += ""

inherit rpm
