SUMMARY = "Documentation for texlive-context-mathsets"
DESCRIPTION = "This package includes the documentation for texlive-context-mathsets"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn47085"

RPM_NAME = "texlive-context-mathsets-doc-2023.209.svn47085-55.1.noarch.rpm"
RPM_HASH = "d16cb5ceb2023f4f26a257430d3b94b6b614227adf2ca920bfcdd832790b2fce41d49976296766a330cd8a3b79791ed66432c491c16aca39bbe7f49beaaba30a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-mathsets-doc"

RDEPENDS:${PN} += ""

inherit rpm
