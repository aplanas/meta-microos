SUMMARY = "Documentation for texlive-biblatex-software"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-software"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2_5svn64030"

RPM_NAME = "texlive-biblatex-software-doc-2023.209.1.2_5svn64030-54.1.noarch.rpm"
RPM_HASH = "b03c92814f6ff18793b26243e75ccd8ec304f83dedf3b212d9fbadb1f7aa20334d2ed4f5715069446b8b2f39918d7f6301bb345cbb23749e1b53672f4a3be42e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-software-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
