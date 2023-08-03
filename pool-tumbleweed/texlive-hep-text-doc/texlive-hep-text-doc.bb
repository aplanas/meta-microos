SUMMARY = "Documentation for texlive-hep-text"
DESCRIPTION = "This package includes the documentation for texlive-hep-text"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn64906"

RPM_NAME = "texlive-hep-text-doc-2023.209.1.1svn64906-54.1.noarch.rpm"
RPM_HASH = "41ddaafe0055c07fe5f99948184e7bcb6f1ba3c7cc9e8e14bb21cc9371472d515dcf457fcef952a20211c33235460ca0cbfeb88844012d30d923d4cfc050c9f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-text-doc"

RDEPENDS:${PN} += ""

inherit rpm
