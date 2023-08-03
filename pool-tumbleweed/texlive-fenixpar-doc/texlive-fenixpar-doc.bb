SUMMARY = "Documentation for texlive-fenixpar"
DESCRIPTION = "This package includes the documentation for texlive-fenixpar"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.92svn24730"

RPM_NAME = "texlive-fenixpar-doc-2023.209.0.0.92svn24730-53.1.noarch.rpm"
RPM_HASH = "631e241d73528bec4656352195f137073ce917520fba3c0a99e291e8cf3c218f94421dbdc7cbb041909172c8f9d8b312407c4b6b0dd6a845a474c93d65c6a7b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fenixpar-doc"

RDEPENDS:${PN} += ""

inherit rpm
