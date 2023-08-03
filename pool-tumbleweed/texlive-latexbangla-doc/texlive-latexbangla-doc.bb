SUMMARY = "Documentation for texlive-latexbangla"
DESCRIPTION = "This package includes the documentation for texlive-latexbangla"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn55475"

RPM_NAME = "texlive-latexbangla-doc-2023.209.0.0.2svn55475-55.1.noarch.rpm"
RPM_HASH = "80666ed365b5cad090353b5df493ea1366cc3dc28c221a609bbc94858cdcd2eb58b7d59b3cc203c3b0df49dc2e7e1c297f05cd96e7bd9d1eb7f2960be43dbcea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexbangla-doc"

RDEPENDS:${PN} += ""

inherit rpm
