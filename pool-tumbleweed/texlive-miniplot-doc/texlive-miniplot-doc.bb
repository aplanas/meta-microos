SUMMARY = "Documentation for texlive-miniplot"
DESCRIPTION = "This package includes the documentation for texlive-miniplot"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn17483"

RPM_NAME = "texlive-miniplot-doc-2023.209.svn17483-55.1.noarch.rpm"
RPM_HASH = "dc3ed6cdfba4230fd3199e6d8b9a5a288c833be2e10216b4af6a2e696842b4fc1487c48fd01aa9d2bb5b9d69f70b1175e48192800f6b336ca8642534ecee82ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-miniplot-doc"

RDEPENDS:${PN} += ""

inherit rpm
