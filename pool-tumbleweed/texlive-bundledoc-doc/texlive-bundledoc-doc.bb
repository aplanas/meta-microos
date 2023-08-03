SUMMARY = "Documentation for texlive-bundledoc"
DESCRIPTION = "This package includes the documentation for texlive-bundledoc"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.4svn64620"

RPM_NAME = "texlive-bundledoc-doc-2023.209.3.4svn64620-53.1.noarch.rpm"
RPM_HASH = "fb1314b74d1bc9f56453c294d5b6f12f398c73c46087547f14eb42fc4bbc97a69a62eacb141671993e2de4e27d2e50ced84cc28577c80670fc8cac85b7e3062c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-arlatex.1 \
man-bundledoc.1 \
texlive-bundledoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
