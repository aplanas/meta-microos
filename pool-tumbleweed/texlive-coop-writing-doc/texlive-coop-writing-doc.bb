SUMMARY = "Documentation for texlive-coop-writing"
DESCRIPTION = "This package includes the documentation for texlive-coop-writing"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.4svn61607"

RPM_NAME = "texlive-coop-writing-doc-2023.209.1.2.4svn61607-55.1.noarch.rpm"
RPM_HASH = "277d0ad01cb4304bcbd160ed04c3db7659803d65a27d3097ed7579925bc67a1fba7385f3b8bfc7c33d2595b06323c8bf6029bdfdbd395d0a4575e2914cba5f62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-coop-writing-doc"

RDEPENDS:${PN} += ""

inherit rpm
