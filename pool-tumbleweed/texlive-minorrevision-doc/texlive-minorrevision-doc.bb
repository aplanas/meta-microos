SUMMARY = "Documentation for texlive-minorrevision"
DESCRIPTION = "This package includes the documentation for texlive-minorrevision"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn32165"

RPM_NAME = "texlive-minorrevision-doc-2023.209.1.1svn32165-55.1.noarch.rpm"
RPM_HASH = "848bba0ccdacd567f327c3bbf19c52af5d623c2fb3cc00d7ff5faa626e291bbf764baccc6f35d8cfa8c6697942b7a5e7a89c947f58e206fc7b794d18416a7013"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-minorrevision-doc"

RDEPENDS:${PN} += ""

inherit rpm
