SUMMARY = "Documentation for texlive-tensor"
DESCRIPTION = "This package includes the documentation for texlive-tensor"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn15878"

RPM_NAME = "texlive-tensor-doc-2023.201.2.1svn15878-54.1.noarch.rpm"
RPM_HASH = "febf63aedd36765ad634a96acf417c8fb9f0e5ae45b85a5ddfda170509238265168b249631561686654d8b7595bae6cb53c5452301bb95606f57ed03a67782f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tensor-doc"

RDEPENDS:${PN} += ""

inherit rpm
