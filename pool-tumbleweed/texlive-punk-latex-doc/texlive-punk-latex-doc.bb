SUMMARY = "Documentation for texlive-punk-latex"
DESCRIPTION = "This package includes the documentation for texlive-punk-latex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1svn27389"

RPM_NAME = "texlive-punk-latex-doc-2023.209.1.1svn27389-54.2.noarch.rpm"
RPM_HASH = "1c2d425925922b18035dbd68aa9cdb86bacdfb43de1feb438b92d84e2eea8e8b097b055802411178ab7504d202dc829c66af3e52166da9093865b79b85974c46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-punk-latex-doc"

RDEPENDS:${PN} += ""

inherit rpm
