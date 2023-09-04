SUMMARY = "Documentation for texlive-innerscript"
DESCRIPTION = "This package includes the documentation for texlive-innerscript"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn57672"

RPM_NAME = "texlive-innerscript-doc-2023.209.1.1svn57672-54.1.noarch.rpm"
RPM_HASH = "fc08ce8183f00ce4cf7ad3bd8cb4bfde83feef0daf49f0ec177b484188ce8074d2181c028fe96388513914b2015e32242a602ca71bf8c92bc86b31b8a430444d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-innerscript-doc"

RDEPENDS:${PN} += ""

inherit rpm
