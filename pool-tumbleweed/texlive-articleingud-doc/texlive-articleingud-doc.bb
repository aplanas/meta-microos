SUMMARY = "Documentation for texlive-articleingud"
DESCRIPTION = "This package includes the documentation for texlive-articleingud"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn38741"

RPM_NAME = "texlive-articleingud-doc-2023.209.0.0.3svn38741-54.1.noarch.rpm"
RPM_HASH = "7beb73bd1dd3091487a024e4851b28fbc04de933171d7563fdc1c06df5db171e69efe4486d2c41a2109aa25422cf652ea269a7decb1ff43697492e129af64ab1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-articleingud-doc-es \
texlive-articleingud-doc"

RDEPENDS:${PN} += ""

inherit rpm
