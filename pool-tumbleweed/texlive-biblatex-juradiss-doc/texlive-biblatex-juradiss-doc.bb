SUMMARY = "Documentation for texlive-biblatex-juradiss"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-juradiss"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.23svn56502"

RPM_NAME = "texlive-biblatex-juradiss-doc-2023.209.0.0.23svn56502-54.1.noarch.rpm"
RPM_HASH = "bc337b3e83556ee138a7a41a441b52f969094e4dcbf8b69b89c31e90d1feb90528a8aba053c73abff122ee56f1ead632a0187dc6d6254c792dc6cf4b486e454a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-juradiss-doc"

RDEPENDS:${PN} += ""

inherit rpm
