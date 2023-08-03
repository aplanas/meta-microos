SUMMARY = "Documentation for texlive-newtxsf"
DESCRIPTION = "This package includes the documentation for texlive-newtxsf"
LICENSE = "OFL-1.1"

PV = "2023.209.1.054svn59227"

RPM_NAME = "texlive-newtxsf-doc-2023.209.1.054svn59227-55.1.noarch.rpm"
RPM_HASH = "6a82d9d378805ce18c6168a7ab29e573c5e8823c6c5fba1a8b5f05327639cb42c17a8b66c9157f142663bcd4b2d4ded919d5cb0c140082e5190a7dcb7a622724"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-newtxsf-doc"

RDEPENDS:${PN} += ""

inherit rpm
