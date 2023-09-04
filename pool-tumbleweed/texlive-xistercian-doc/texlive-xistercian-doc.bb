SUMMARY = "Documentation for texlive-xistercian"
DESCRIPTION = "This package includes the documentation for texlive-xistercian"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn61366"

RPM_NAME = "texlive-xistercian-doc-2023.209.1.2svn61366-53.2.noarch.rpm"
RPM_HASH = "779872e09f8974e3f37446979adef5d4f21a64865df112f7335f0f3d2b94a5179d0c9779f8601b33b3533c8129e8bcc2d5aaad04290b39670e7296931bd0ffc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xistercian-doc"

RDEPENDS:${PN} += ""

inherit rpm
