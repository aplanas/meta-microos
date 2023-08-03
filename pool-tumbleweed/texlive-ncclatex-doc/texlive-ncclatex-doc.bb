SUMMARY = "Documentation for texlive-ncclatex"
DESCRIPTION = "This package includes the documentation for texlive-ncclatex"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn15878"

RPM_NAME = "texlive-ncclatex-doc-2023.209.1.5svn15878-55.1.noarch.rpm"
RPM_HASH = "9e10d65ee60dc7e01ca0d85949af56f7fbda8664bcd2aafc9b586f552a71f2e8a45ee798244033fc6a59ff6de7dc986e025f1e67321632e48c0832697404472f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ncclatex-doc-ru \
texlive-ncclatex-doc"

RDEPENDS:${PN} += ""

inherit rpm
