SUMMARY = "Documentation for texlive-kdpcover"
DESCRIPTION = "This package includes the documentation for texlive-kdpcover"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5.1svn65150"

RPM_NAME = "texlive-kdpcover-doc-2023.201.0.0.5.1svn65150-55.1.noarch.rpm"
RPM_HASH = "501427198ccfb13d8c4228af19be59566d08a350bebb7e6c5f0c19896b0ba16cbeae601837867fae667fb05d2bec98b82767a2b263f3001507e19d87718e6fa3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kdpcover-doc"

RDEPENDS:${PN} += ""

inherit rpm
