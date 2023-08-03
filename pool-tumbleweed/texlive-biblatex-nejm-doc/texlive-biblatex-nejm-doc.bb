SUMMARY = "Documentation for texlive-biblatex-nejm"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-nejm"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5.0svn49839"

RPM_NAME = "texlive-biblatex-nejm-doc-2023.209.0.0.5.0svn49839-54.1.noarch.rpm"
RPM_HASH = "a4d78b5b79f5c0c4106fb9e6b1504d3871f1b59ba90fec4d69e1dc55954970fc79e75303a2f75e36eb5c5a4ee4e1aa7c726cac622518fc3d86cc1dc663610403"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-nejm-doc"

RDEPENDS:${PN} += ""

inherit rpm
