SUMMARY = "Documentation for texlive-cmcyr"
DESCRIPTION = "This package includes the documentation for texlive-cmcyr"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn60630"

RPM_NAME = "texlive-cmcyr-doc-2023.201.svn60630-53.1.noarch.rpm"
RPM_HASH = "21eaf1966e8890d331e394b9a6d07d41d8138a7c52a6bfa0e44df686b7428240fd8b816d957281d0db77665ee299913b629e5bb4aa7ef7439ebdbc54aa3a5686"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cmcyr-doc"
RDEPENDS:${PN} += ""

inherit rpm
