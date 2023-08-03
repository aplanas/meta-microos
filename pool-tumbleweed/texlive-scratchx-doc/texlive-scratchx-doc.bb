SUMMARY = "Documentation for texlive-scratchx"
DESCRIPTION = "This package includes the documentation for texlive-scratchx"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn44906"

RPM_NAME = "texlive-scratchx-doc-2023.209.1.1svn44906-54.1.noarch.rpm"
RPM_HASH = "4b8f29b18aa4dff44583326ba17f885c7e364da55b74f7930d750e52452fb968ca19622396c6c558c9c50b6358c9385c4b432040db468404e6ca3189f5e7db17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-scratchx-doc-fr \
texlive-scratchx-doc"

RDEPENDS:${PN} += ""

inherit rpm
