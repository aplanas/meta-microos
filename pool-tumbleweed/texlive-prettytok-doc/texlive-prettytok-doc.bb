SUMMARY = "Documentation for texlive-prettytok"
DESCRIPTION = "This package includes the documentation for texlive-prettytok"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.0.1svn63842"

RPM_NAME = "texlive-prettytok-doc-2023.209.0.0.0.1svn63842-53.1.noarch.rpm"
RPM_HASH = "631c3af88b65c9517e2164d00affcfa4992974c8742b2f5bf3e072b8c868148eea5e15dcdd6575a982e10c250c1bf97b0201c6cf0cb044c9919470089e83ccd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-prettytok-doc"

RDEPENDS:${PN} += ""

inherit rpm
