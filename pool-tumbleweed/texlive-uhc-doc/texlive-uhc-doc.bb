SUMMARY = "Documentation for texlive-uhc"
DESCRIPTION = "This package includes the documentation for texlive-uhc"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn16791"

RPM_NAME = "texlive-uhc-doc-2023.209.svn16791-54.1.noarch.rpm"
RPM_HASH = "52b78c2c2508fd41a6104a1fa0a4b1e60b9f4adca41d35236f313326ff5291a153071f4b81f08aa9d7388019fe3ca092ff13f41a6afcd6fe57879f77d0cda4f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uhc-doc"

RDEPENDS:${PN} += ""

inherit rpm
