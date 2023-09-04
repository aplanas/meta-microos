SUMMARY = "Documentation for texlive-handoutwithnotes"
DESCRIPTION = "This package includes the documentation for texlive-handoutwithnotes"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn62140"

RPM_NAME = "texlive-handoutwithnotes-doc-2023.209.1.3svn62140-54.2.noarch.rpm"
RPM_HASH = "092ec4fef6be896ca1c56f390eec159a569399c6a4eb15b95e183e2a7e634457d4f4c6a0801f79d9590c68f33a96e47b6684afaf30497f5bbb67f414b9527949"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-handoutwithnotes-doc"

RDEPENDS:${PN} += ""

inherit rpm
