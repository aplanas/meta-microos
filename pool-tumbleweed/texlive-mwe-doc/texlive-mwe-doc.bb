SUMMARY = "Documentation for texlive-mwe"
DESCRIPTION = "This package includes the documentation for texlive-mwe"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn64967"

RPM_NAME = "texlive-mwe-doc-2023.201.0.0.5svn64967-54.1.noarch.rpm"
RPM_HASH = "3cf3670b98aeac64e84f7faa824884ba51598291d0d841a037bbe9c9f74b878a82ebe7c3519544be9a474e384d48912d36c161e7685c6223b6d8eb8dadfc376a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mwe-doc"

RDEPENDS:${PN} += ""

inherit rpm
