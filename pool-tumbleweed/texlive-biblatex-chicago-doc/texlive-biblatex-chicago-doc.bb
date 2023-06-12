SUMMARY = "Documentation for texlive-biblatex-chicago"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-chicago"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3asvn65037"

RPM_NAME = "texlive-biblatex-chicago-doc-2023.201.2.3asvn65037-53.1.noarch.rpm"
RPM_HASH = "d1cd693a8de020dc34aad37b04efd0587aac3f093c29b56a130f3d3cca87610cdf1594b609f25e66be47480546bd3cf02787d34b889c3354312c072c9ad894b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-chicago-doc"
RDEPENDS:${PN} += ""

inherit rpm
