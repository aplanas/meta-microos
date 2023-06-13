SUMMARY = "Documentation for texlive-hep-text"
DESCRIPTION = "This package includes the documentation for texlive-hep-text"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn64906"

RPM_NAME = "texlive-hep-text-doc-2023.201.1.1svn64906-53.1.noarch.rpm"
RPM_HASH = "56e76621730c55f96d9bf1b5813a835a654896d4ed62369b6d86c4996918cbd7755ed78347956dbd2891ea10fd08aad181ee02ad3b7e8b7775c124131f1b7519"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-text-doc"

RDEPENDS:${PN} += ""

inherit rpm
