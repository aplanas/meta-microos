SUMMARY = "Documentation for texlive-bankstatement"
DESCRIPTION = "This package includes the documentation for texlive-bankstatement"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.9.2svn38857"

RPM_NAME = "texlive-bankstatement-doc-2023.209.0.0.9.2svn38857-54.1.noarch.rpm"
RPM_HASH = "06f872f5e81cbafb8dc5cd43d006d7d647dc3ccb4d8059092813e6cc2a57e2d052c62938a43a776f572d63928a1e85b9ea35fdd1ea98f00fc8bb1be84c0eb331"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bankstatement-doc"

RDEPENDS:${PN} += ""

inherit rpm
