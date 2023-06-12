SUMMARY = "Documentation for texlive-a5comb"
DESCRIPTION = "This package includes the documentation for texlive-a5comb"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.4svn17020"

RPM_NAME = "texlive-a5comb-doc-2023.201.4svn17020-54.1.noarch.rpm"
RPM_HASH = "2ec5945b265717ee705ffd102e9a2a55d096ba8980ea46893092853c198ddd6cecf4d0781759f42f7fd2a068e364c6e9be6627a4e03a96f2fb2b9c2d93461dbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-a5comb-doc"
RDEPENDS:${PN} += ""

inherit rpm
