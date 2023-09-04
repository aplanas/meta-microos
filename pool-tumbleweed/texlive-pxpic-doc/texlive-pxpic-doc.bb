SUMMARY = "Documentation for texlive-pxpic"
DESCRIPTION = "This package includes the documentation for texlive-pxpic"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn65803"

RPM_NAME = "texlive-pxpic-doc-2023.209.1.4svn65803-54.2.noarch.rpm"
RPM_HASH = "1f74df917d1d07b4495df2583f0df1b3f6ab49dc3e2d24880d257c8d367b9509cb36d81e6cf02fb6e96617e9582dd7f664d3b99b01c3570584474011994f0ace"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pxpic-doc"

RDEPENDS:${PN} += ""

inherit rpm
