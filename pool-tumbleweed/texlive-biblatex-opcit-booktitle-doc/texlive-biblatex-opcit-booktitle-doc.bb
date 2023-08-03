SUMMARY = "Documentation for texlive-biblatex-opcit-booktitle"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-opcit-booktitle"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.9.0svn48983"

RPM_NAME = "texlive-biblatex-opcit-booktitle-doc-2023.209.1.9.0svn48983-54.1.noarch.rpm"
RPM_HASH = "a77f9b07817af947632d17a1dc002fc51cfa3ec0e88fa88c9a5849c44f6528ca7033a218ec9b9472b6ea1abd0fe3b17cfc79b81b0e58ecadfd2ca8961f69713c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-opcit-booktitle-doc"

RDEPENDS:${PN} += ""

inherit rpm
