SUMMARY = "Documentation for texlive-babel-thai"
DESCRIPTION = "This package includes the documentation for texlive-babel-thai"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.0svn30564"

RPM_NAME = "texlive-babel-thai-doc-2023.201.1.0.0svn30564-53.1.noarch.rpm"
RPM_HASH = "0af3dbe04081853a0efb36d38e4e8044420cd52b526318fbac84a44b36a899b8762820eac4c3afe05dd1308e76072eca5e9f6b04da330436c3bd387cf9f3289e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-thai-doc"

RDEPENDS:${PN} += ""

inherit rpm
