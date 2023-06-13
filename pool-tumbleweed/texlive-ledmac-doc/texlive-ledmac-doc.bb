SUMMARY = "Documentation for texlive-ledmac"
DESCRIPTION = "This package includes the documentation for texlive-ledmac"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.19.4svn41811"

RPM_NAME = "texlive-ledmac-doc-2023.201.0.0.19.4svn41811-54.1.noarch.rpm"
RPM_HASH = "9683ea2f3fa3664feb827c849a8c548172d651284b501cf794255a8eda18ba2fef06f22c19fc3476b123c7553d694dc561205c0817c20b37a5402ea97bac4db5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ledmac-doc"

RDEPENDS:${PN} += ""

inherit rpm
