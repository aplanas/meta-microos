SUMMARY = "Documentation for texlive-asypictureb"
DESCRIPTION = "This package includes the documentation for texlive-asypictureb"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn33490"

RPM_NAME = "texlive-asypictureb-doc-2023.209.0.0.3svn33490-54.1.noarch.rpm"
RPM_HASH = "dbd2282286e0bdaf9baf1a2b12d3b75101c0b41046716a8ac7fc71a1a95b29e02e7273a3799d4f478d503fa94d0e553d81a375bc4657e5245bce3418172e6af4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-asypictureb-doc"

RDEPENDS:${PN} += ""

inherit rpm
