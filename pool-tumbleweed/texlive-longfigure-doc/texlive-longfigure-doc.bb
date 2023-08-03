SUMMARY = "Documentation for texlive-longfigure"
DESCRIPTION = "This package includes the documentation for texlive-longfigure"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn34302"

RPM_NAME = "texlive-longfigure-doc-2023.209.1.0svn34302-55.1.noarch.rpm"
RPM_HASH = "5e9e99bed74c5322cb58dcc4df6d35cd2807247cddc41a4be7bab63f0b162ec63b9647087641c33baac9a1541dd5a6d1759a044bdbeb144ad28737dc94fdc130"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-longfigure-doc"

RDEPENDS:${PN} += ""

inherit rpm
