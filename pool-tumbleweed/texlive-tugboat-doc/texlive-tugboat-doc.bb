SUMMARY = "Documentation for texlive-tugboat"
DESCRIPTION = "This package includes the documentation for texlive-tugboat"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.29svn66513"

RPM_NAME = "texlive-tugboat-doc-2023.201.2.29svn66513-52.1.noarch.rpm"
RPM_HASH = "ab2d625c8db40fedf74841509094020430d20c51f77904623d39ced50477410610277d4750700a6daaba10b552f473f1468b9da049a12f45c42aeba47c89014f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-tugboat-doc:en) \
texlive-tugboat-doc"
RDEPENDS:${PN} += ""

inherit rpm
