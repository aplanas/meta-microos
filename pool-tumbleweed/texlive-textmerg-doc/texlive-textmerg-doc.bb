SUMMARY = "Documentation for texlive-textmerg"
DESCRIPTION = "This package includes the documentation for texlive-textmerg"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.2.01svn20677"

RPM_NAME = "texlive-textmerg-doc-2023.209.2.01svn20677-55.1.noarch.rpm"
RPM_HASH = "dc59c661069d87daa810c635b6040e8f04418ec2218ea3149d786fd9f4b14041f615e089b217616a24eb321c4c4b8e93d313b8869bf4b21619b8334f5860a08e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-textmerg-doc"

RDEPENDS:${PN} += ""

inherit rpm
