SUMMARY = "Documentation for texlive-hrlatex"
DESCRIPTION = "This package includes the documentation for texlive-hrlatex"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.23svn18020"

RPM_NAME = "texlive-hrlatex-doc-2023.209.0.0.23svn18020-54.1.noarch.rpm"
RPM_HASH = "78c9d3710791052c74a6c4fd76707c8d9310573cc94ac3d0b58b6b5c3ca7af3ff3f548b3b663026027d7e0c88bcfdb7223346590b4539586e5411952d2e68903"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hrlatex-doc-hr \
texlive-hrlatex-doc"

RDEPENDS:${PN} += ""

inherit rpm
