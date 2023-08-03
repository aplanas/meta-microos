SUMMARY = "Documentation for texlive-robustindex"
DESCRIPTION = "This package includes the documentation for texlive-robustindex"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn49877"

RPM_NAME = "texlive-robustindex-doc-2023.209.svn49877-54.1.noarch.rpm"
RPM_HASH = "788db63bda4f40b2fce535c6f8e9a3f0dfc2b5a1116a5002a775a190984dab92a1a5b5e29d249b73182816992b598ec5722159fb29920da6e103b51fcbc9fcc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-robustindex-doc"

RDEPENDS:${PN} += ""

inherit rpm
