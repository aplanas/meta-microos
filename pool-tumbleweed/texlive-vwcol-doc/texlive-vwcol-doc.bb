SUMMARY = "Documentation for texlive-vwcol"
DESCRIPTION = "This package includes the documentation for texlive-vwcol"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn36254"

RPM_NAME = "texlive-vwcol-doc-2023.209.0.0.2svn36254-54.1.noarch.rpm"
RPM_HASH = "6e6071ce6736faedc5b403300235e026e16d95fd69163d66c4ce655c1a48cba796184ae9e7230a44c9813b09e78bc29f517609ed56541b4ad9d1d804e656686a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-vwcol-doc"

RDEPENDS:${PN} += ""

inherit rpm
