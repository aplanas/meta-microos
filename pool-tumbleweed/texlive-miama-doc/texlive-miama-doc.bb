SUMMARY = "Documentation for texlive-miama"
DESCRIPTION = "This package includes the documentation for texlive-miama"
LICENSE = "OFL-1.1"

PV = "2023.201.1.1svn54512"

RPM_NAME = "texlive-miama-doc-2023.201.1.1svn54512-54.1.noarch.rpm"
RPM_HASH = "e6c30e50b9ea673e648de7b6c105e56a04f6165e5074b394957c40e855f2975d7b538bce3891bee7af2a9d79375a4c337de7c26d18e4f82853e4c07e963ebf74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-miama-doc"

RDEPENDS:${PN} += ""

inherit rpm
