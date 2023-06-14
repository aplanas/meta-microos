SUMMARY = "Documentation for texlive-arsclassica"
DESCRIPTION = "This package includes the documentation for texlive-arsclassica"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn45656"

RPM_NAME = "texlive-arsclassica-doc-2023.201.svn45656-53.1.noarch.rpm"
RPM_HASH = "73d7328f025815f259b9b92c034d89df555051b6ff49d5fc897b7ec694e3f894ffe5d4546a5eb11562f546b2da37861dc169850988a65f28a0ede5d3ee51d788"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-arsclassica-doc-en \
texlive-arsclassica-doc"

RDEPENDS:${PN} += ""

inherit rpm
