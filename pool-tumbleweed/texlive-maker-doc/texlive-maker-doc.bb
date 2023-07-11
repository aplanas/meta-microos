SUMMARY = "Documentation for texlive-maker"
DESCRIPTION = "This package includes the documentation for texlive-maker"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.0svn44823"

RPM_NAME = "texlive-maker-doc-2023.208.1.0svn44823-53.1.noarch.rpm"
RPM_HASH = "2696b39c76dea5e4a12ee3024ec0862d806870cb446f7d8684cfcd4be4968af5e4aa748c05c52b32fa42cb88f5115940aed08247c5fe1196caa20b4711df08cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-maker-doc"

RDEPENDS:${PN} += ""

inherit rpm
