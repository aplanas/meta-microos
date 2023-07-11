SUMMARY = "Documentation for texlive-hwemoji"
DESCRIPTION = "This package includes the documentation for texlive-hwemoji"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.0svn65001"

RPM_NAME = "texlive-hwemoji-doc-2023.208.1.0svn65001-53.1.noarch.rpm"
RPM_HASH = "bcca46d1df2784ee0d3486b517017716115370f92534c7a025ae9840229af80ca77de08239650d8ed98fd3f2e88d7bd9c80873749a83006096b71c7139ec474e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hwemoji-doc"

RDEPENDS:${PN} += ""

inherit rpm
