SUMMARY = "Documentation for texlive-tabfigures"
DESCRIPTION = "This package includes the documentation for texlive-tabfigures"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn25202"

RPM_NAME = "texlive-tabfigures-doc-2023.209.1.1svn25202-58.1.noarch.rpm"
RPM_HASH = "16b7367996c33629a28279053d382ca17777db7cc7428fc81497084c28c502e623b7d0989323862b8a4a54859b2e09a648c392513d83b10afb8ce6239f2f8be4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tabfigures-doc"

RDEPENDS:${PN} += ""

inherit rpm
