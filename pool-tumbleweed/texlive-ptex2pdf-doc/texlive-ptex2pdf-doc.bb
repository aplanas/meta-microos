SUMMARY = "Documentation for texlive-ptex2pdf"
DESCRIPTION = "This package includes the documentation for texlive-ptex2pdf"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.20200520.0svn65953"

RPM_NAME = "texlive-ptex2pdf-doc-2023.209.20200520.0svn65953-54.1.noarch.rpm"
RPM_HASH = "314636fde1f52066785cbb61402f8a87cb0fca730ed70f771854c4dd7adf1942fe5bcd96ac1a70166f2bc3a442c157053e41722d05641f78918459e370686f54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ptex2pdf-doc"

RDEPENDS:${PN} += ""

inherit rpm
