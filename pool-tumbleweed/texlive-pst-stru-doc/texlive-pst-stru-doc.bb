SUMMARY = "Documentation for texlive-pst-stru"
DESCRIPTION = "This package includes the documentation for texlive-pst-stru"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.13svn38613"

RPM_NAME = "texlive-pst-stru-doc-2023.209.0.0.13svn38613-54.2.noarch.rpm"
RPM_HASH = "4c3520b9649b2aef23e7887ff559cc2fd8ffa133c0b90db46ee8b982b5a0ddaf1c1f1d6e0664a09147c51c31d6da72d0bf8c59a052a70429332d9eeee000edfd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-stru-doc"

RDEPENDS:${PN} += ""

inherit rpm
