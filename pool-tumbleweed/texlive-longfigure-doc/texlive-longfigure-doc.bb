SUMMARY = "Documentation for texlive-longfigure"
DESCRIPTION = "This package includes the documentation for texlive-longfigure"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn34302"

RPM_NAME = "texlive-longfigure-doc-2023.201.1.0svn34302-54.1.noarch.rpm"
RPM_HASH = "a2e896da7762958255cfc6cb6ec66d28125b577e0ca60ef81db95e409902648ad011800daef61dd573458f5117a537ac2ebec17b8c581ecfd85e49d324fa810f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-longfigure-doc"

RDEPENDS:${PN} += ""

inherit rpm
