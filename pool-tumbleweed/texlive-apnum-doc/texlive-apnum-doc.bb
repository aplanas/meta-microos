SUMMARY = "Documentation for texlive-apnum"
DESCRIPTION = "This package includes the documentation for texlive-apnum"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.7svn47510"

RPM_NAME = "texlive-apnum-doc-2023.209.1.7svn47510-55.1.noarch.rpm"
RPM_HASH = "37f8b2ec52e747296483de7409556dc07e0013f00038b368f461e1787dfe2a93a3e1271484406e87de4b6107512a3af23b809ce1a69d4e2ab44134bbe08d4686"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-apnum-doc"

RDEPENDS:${PN} += ""

inherit rpm
