SUMMARY = "Documentation for texlive-linguisticspro"
DESCRIPTION = "This package includes the documentation for texlive-linguisticspro"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn64858"

RPM_NAME = "texlive-linguisticspro-doc-2023.209.svn64858-55.1.noarch.rpm"
RPM_HASH = "1d90aaf040fb0813d3aa9c85ce19379541743f33dd9049d55a671bd39634a9edd5d69e1192a1c8c109c5ad7697c711065b70514cb15be0f3a565c163cf9ae91c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-linguisticspro-doc"

RDEPENDS:${PN} += ""

inherit rpm
