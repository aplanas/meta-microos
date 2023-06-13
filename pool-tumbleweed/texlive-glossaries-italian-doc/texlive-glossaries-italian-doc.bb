SUMMARY = "Documentation for texlive-glossaries-italian"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-italian"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn35665"

RPM_NAME = "texlive-glossaries-italian-doc-2023.201.1.0svn35665-53.1.noarch.rpm"
RPM_HASH = "90d23df752d61fb757c51e7ea9376aaf62ba86f0247949bc8d64776bb63edef7cf46f1b98dada7836f830c6007ef1236d69c1667d40152d656535f6e69236d5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-italian-doc"

RDEPENDS:${PN} += ""

inherit rpm
