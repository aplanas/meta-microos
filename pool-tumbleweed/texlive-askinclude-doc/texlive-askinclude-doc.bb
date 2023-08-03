SUMMARY = "Documentation for texlive-askinclude"
DESCRIPTION = "This package includes the documentation for texlive-askinclude"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.7svn54725"

RPM_NAME = "texlive-askinclude-doc-2023.209.2.7svn54725-54.1.noarch.rpm"
RPM_HASH = "cc76a54587425e770f225bf6bd9c31f3b16647baa5ba4edac29f4cc34439a69739260156037a35272ef9095c8138c53df9600c9aa5d04ce419880aa0be7fe7c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-askinclude-doc"

RDEPENDS:${PN} += ""

inherit rpm
