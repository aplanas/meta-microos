SUMMARY = "Documentation for texlive-labels"
DESCRIPTION = "This package includes the documentation for texlive-labels"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.13svn15878"

RPM_NAME = "texlive-labels-doc-2023.209.0.0.13svn15878-56.1.noarch.rpm"
RPM_HASH = "8566dab328806b7d5018d74ecb362b4d752cde54a39a70cc78dc63971475a53238b8c95f6385b477dfc29120f7f351a4aa6cc3188319a4b7815d84645c473fc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-labels-doc"

RDEPENDS:${PN} += ""

inherit rpm
