SUMMARY = "Documentation for texlive-css-colors"
DESCRIPTION = "This package includes the documentation for texlive-css-colors"
LICENSE = "LPPL-1.0"

PV = "2023.204.1.02svn54512"

RPM_NAME = "texlive-css-colors-doc-2023.204.1.02svn54512-54.1.noarch.rpm"
RPM_HASH = "2f85be3f2aa9a5f30a2ce886f4130a8afef18c71834322265cdd16583d6c3878b36421eac9e151635d9b552da641e3963f3ce1558b437d9745ba52d03d134441"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-css-colors-doc"

RDEPENDS:${PN} += ""

inherit rpm
