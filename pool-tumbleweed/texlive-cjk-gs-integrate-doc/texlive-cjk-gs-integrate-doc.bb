SUMMARY = "Documentation for texlive-cjk-gs-integrate"
DESCRIPTION = "This package includes the documentation for texlive-cjk-gs-integrate"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.20210625.0svn59705"

RPM_NAME = "texlive-cjk-gs-integrate-doc-2023.209.20210625.0svn59705-54.1.noarch.rpm"
RPM_HASH = "a0c9570e8fb5d24f816d9abb2ae520fe3f3e236dd58296ad4a0a5e857416c68a05a8a8414b030b77ae7df8dbfb321fe6d335178eee771ab5b17ecf6095029aff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cjk-gs-integrate-doc"

RDEPENDS:${PN} += ""

inherit rpm
