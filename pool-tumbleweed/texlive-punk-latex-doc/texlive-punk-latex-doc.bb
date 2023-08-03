SUMMARY = "Documentation for texlive-punk-latex"
DESCRIPTION = "This package includes the documentation for texlive-punk-latex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1svn27389"

RPM_NAME = "texlive-punk-latex-doc-2023.209.1.1svn27389-54.1.noarch.rpm"
RPM_HASH = "17dff3da2f5ab8f1d17d01ebbec8a544b10b0bb72d175fcb4bfde563e99e92298675f98b274ea603cfda72d8a15840254d1bc067c47bb6e771689acb94386d44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-punk-latex-doc"

RDEPENDS:${PN} += ""

inherit rpm
