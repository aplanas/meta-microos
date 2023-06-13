SUMMARY = "Documentation for texlive-directory"
DESCRIPTION = "This package includes the documentation for texlive-directory"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.20svn15878"

RPM_NAME = "texlive-directory-doc-2023.201.1.20svn15878-52.1.noarch.rpm"
RPM_HASH = "a40950d56992c2ac131c3f0414bebc6068961b78d435a52b4c7e8786ea6f33bf64ffd9fccf6d12d38232f9c3ccb78ab13a503a6cf9f18aa9aaea37b36fd64c71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-directory-doc"

RDEPENDS:${PN} += ""

inherit rpm
