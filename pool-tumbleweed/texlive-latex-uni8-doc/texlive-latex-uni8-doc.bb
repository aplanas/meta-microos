SUMMARY = "Documentation for texlive-latex-uni8"
DESCRIPTION = "This package includes the documentation for texlive-latex-uni8"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.03svn49729"

RPM_NAME = "texlive-latex-uni8-doc-2023.209.0.0.03svn49729-56.1.noarch.rpm"
RPM_HASH = "155a45226547fc8fc8bb68f54f4d229bec70520f0dfeeb5e8b9006a395ce7e83d5cae8b5b3dac6b60a8b83fcb06a33da47299d4aac1a8705c55e22b1a527043d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-uni8-doc"

RDEPENDS:${PN} += ""

inherit rpm
