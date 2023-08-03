SUMMARY = "Documentation for texlive-pst-bezier"
DESCRIPTION = "This package includes the documentation for texlive-pst-bezier"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.03svn41981"

RPM_NAME = "texlive-pst-bezier-doc-2023.209.0.0.03svn41981-53.1.noarch.rpm"
RPM_HASH = "3705232a1ec2467cc9d4799e7f2424b0496b3ab0822f0d90f0c9ed8d1af36b10e7c45398148474a17af249e280a5eae95267212930b54c53c7783c4389a944ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-bezier-doc"

RDEPENDS:${PN} += ""

inherit rpm
