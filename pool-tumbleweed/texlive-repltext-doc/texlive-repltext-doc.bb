SUMMARY = "Documentation for texlive-repltext"
DESCRIPTION = "This package includes the documentation for texlive-repltext"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn56433"

RPM_NAME = "texlive-repltext-doc-2023.201.1.1svn56433-53.2.noarch.rpm"
RPM_HASH = "ce438f4d7f48f80e2f11a31d7fe2e85eb73e29ec27fd9f796ff5c4bcc5d8f566a5aa82637498810a055932728e442f6c6c2e91d0fd87b93c80f2ecf75d792f7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-repltext-doc"

RDEPENDS:${PN} += ""

inherit rpm
