SUMMARY = "Documentation for texlive-dashrule"
DESCRIPTION = "This package includes the documentation for texlive-dashrule"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn29579"

RPM_NAME = "texlive-dashrule-doc-2023.209.1.3svn29579-55.1.noarch.rpm"
RPM_HASH = "e5ed5b8251022bc5bfe00338b756d9ac2b7725960ae3f572f21f0e3337b9f91d99de85f6ccb4234ebd458d2143b302f55b15007c271c74967b7b6a43782f693b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dashrule-doc"

RDEPENDS:${PN} += ""

inherit rpm
