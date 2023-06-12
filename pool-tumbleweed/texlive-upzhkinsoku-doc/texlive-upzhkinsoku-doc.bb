SUMMARY = "Documentation for texlive-upzhkinsoku"
DESCRIPTION = "This package includes the documentation for texlive-upzhkinsoku"
LICENSE = "SUSE-TeX"

PV = "2023.201.0.0.5svn47354"

RPM_NAME = "texlive-upzhkinsoku-doc-2023.201.0.0.5svn47354-53.1.noarch.rpm"
RPM_HASH = "9ddfbd888a459ec258a6d78ef912060b70191195aac6f59e8e67e6e907a005a0b46a3853c6157c05dfc2534eae805fc5ff50f43ab18f468399afc3550fd8eca7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-upzhkinsoku-doc"
RDEPENDS:${PN} += ""

inherit rpm
