SUMMARY = "Documentation for texlive-framed"
DESCRIPTION = "This package includes the documentation for texlive-framed"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.96svn26789"

RPM_NAME = "texlive-framed-doc-2023.201.0.0.96svn26789-52.1.noarch.rpm"
RPM_HASH = "bf7f1a6db1620ff89b1045a00895c664bc61b5d9cdeb306588aba0ed9a7a32cd830fece70f8ba06182eecd0d9f1c6885fbceb2d21927f314d5b766501790ad25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-framed-doc"

RDEPENDS:${PN} += ""

inherit rpm
