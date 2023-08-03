SUMMARY = "Documentation for texlive-layaureo"
DESCRIPTION = "This package includes the documentation for texlive-layaureo"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn19087"

RPM_NAME = "texlive-layaureo-doc-2023.209.0.0.2svn19087-55.1.noarch.rpm"
RPM_HASH = "116f8a3cacf9cea07f578bcc5864648583b4afa1b603dd5d55720c6fe7fe358435970ec574326ed157de15fe9308d075ed60549447d68875de2ac56c694b9d2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-layaureo-doc-it \
texlive-layaureo-doc"

RDEPENDS:${PN} += ""

inherit rpm
