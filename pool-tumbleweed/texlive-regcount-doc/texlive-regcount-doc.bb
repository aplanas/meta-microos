SUMMARY = "Documentation for texlive-regcount"
DESCRIPTION = "This package includes the documentation for texlive-regcount"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn19979"

RPM_NAME = "texlive-regcount-doc-2023.209.1.0svn19979-54.1.noarch.rpm"
RPM_HASH = "1208ee3642cff7cc7689fdc7b2f594d34dbfd1d32defacf9a5663c5d01f53da25b6c6e5163f382e49a1ae9180fa1ffa3b3aa697c17e62858d7926778786abb7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-regcount-doc"

RDEPENDS:${PN} += ""

inherit rpm
