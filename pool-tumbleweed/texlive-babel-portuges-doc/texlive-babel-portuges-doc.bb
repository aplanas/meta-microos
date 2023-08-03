SUMMARY = "Documentation for texlive-babel-portuges"
DESCRIPTION = "This package includes the documentation for texlive-babel-portuges"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2tsvn59883"

RPM_NAME = "texlive-babel-portuges-doc-2023.209.1.2tsvn59883-54.1.noarch.rpm"
RPM_HASH = "6eda5e137d651962d8d43d3aff906d28e72d826f55d4150991c84d2b4a6677e6302e36bfc1a6902d84be4fee2cea986845267ca7317235874885f39b31c66157"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-portuges-doc"

RDEPENDS:${PN} += ""

inherit rpm
