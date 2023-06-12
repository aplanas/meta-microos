SUMMARY = "Documentation for texlive-snotez"
DESCRIPTION = "This package includes the documentation for texlive-snotez"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7svn61992"

RPM_NAME = "texlive-snotez-doc-2023.201.0.0.7svn61992-57.1.noarch.rpm"
RPM_HASH = "b22221f4df7cd65a9a9ea769bb8b6b3840f984d2de555fdbdb0f1a1c4c3a16bbad9a1492ed1bdfb54b7182efe4913828ae6aa25e8762b8b59b1d532cc3adabff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-snotez-doc"
RDEPENDS:${PN} += ""

inherit rpm
