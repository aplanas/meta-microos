SUMMARY = "Documentation for texlive-librefranklin"
DESCRIPTION = "This package includes the documentation for texlive-librefranklin"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn64441"

RPM_NAME = "texlive-librefranklin-doc-2023.201.svn64441-54.1.noarch.rpm"
RPM_HASH = "bac08db1bd10de0cc4ae5bb56e116ecda0088caefb2a8ef8faa49976d12fe816bb60e779d802a901908ae19e42473ba0327ac148ba6b310ac34fef21a1bbf376"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-librefranklin-doc"

RDEPENDS:${PN} += ""

inherit rpm
