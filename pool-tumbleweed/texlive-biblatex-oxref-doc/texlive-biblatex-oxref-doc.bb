SUMMARY = "Documentation for texlive-biblatex-oxref"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-oxref"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.0svn65707"

RPM_NAME = "texlive-biblatex-oxref-doc-2023.209.3.0svn65707-54.1.noarch.rpm"
RPM_HASH = "8cbf456439aba0ce699e655d7d07e6a9a6a6512e79fe4be8964995f546b4f25aaa4a40d18f1a1e5aae5838f7a260874bee373e936e9e41e73a2a367560bbddc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-oxref-doc"

RDEPENDS:${PN} += ""

inherit rpm
