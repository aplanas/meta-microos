SUMMARY = "Documentation for texlive-xetexko"
DESCRIPTION = "This package includes the documentation for texlive-xetexko"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.2svn64894"

RPM_NAME = "texlive-xetexko-doc-2023.209.4.2svn64894-53.2.noarch.rpm"
RPM_HASH = "0f2e10e0a3918f0b8a823b7a83702ec8c67997091756ce487567379da93903db445a23edbcb93c289f6566be9cbf09a56545b014f15de41755a6cd5ec82809ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xetexko-doc-ko \
texlive-xetexko-doc"

RDEPENDS:${PN} += ""

inherit rpm
