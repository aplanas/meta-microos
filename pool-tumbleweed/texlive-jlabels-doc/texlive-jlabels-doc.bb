SUMMARY = "Documentation for texlive-jlabels"
DESCRIPTION = "This package includes the documentation for texlive-jlabels"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn24858"

RPM_NAME = "texlive-jlabels-doc-2023.201.svn24858-55.1.noarch.rpm"
RPM_HASH = "55f1a133b955cbca7c4aecb37236eddd1adb55eab3b4709e675e3650009d0678f8c7653b34d16f90329e063cd4f02e73b7fbe3d449f6d498f949b0b760a5f83c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jlabels-doc"
RDEPENDS:${PN} += ""

inherit rpm
