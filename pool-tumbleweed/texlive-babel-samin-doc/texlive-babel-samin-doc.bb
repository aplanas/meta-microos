SUMMARY = "Documentation for texlive-babel-samin"
DESCRIPTION = "This package includes the documentation for texlive-babel-samin"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0csvn30288"

RPM_NAME = "texlive-babel-samin-doc-2023.201.1.0csvn30288-53.1.noarch.rpm"
RPM_HASH = "b36fd2be08c5202ac57b12516972e7b444611e165d62b7cc53d1f96be2b63ab1c7c3dd6781c3cd26130e1b5f5e9cdb810228bfe3ce2a4537d24ed0924c113d09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-samin-doc"
RDEPENDS:${PN} += ""

inherit rpm
