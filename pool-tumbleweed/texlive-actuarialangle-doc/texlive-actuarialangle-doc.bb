SUMMARY = "Documentation for texlive-actuarialangle"
DESCRIPTION = "This package includes the documentation for texlive-actuarialangle"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn51376"

RPM_NAME = "texlive-actuarialangle-doc-2023.209.2.1svn51376-55.1.noarch.rpm"
RPM_HASH = "19b137e7cb9c354d8be71356a3094b4aa55391b18ad9b87985cd191bbca28ff98c26a8deabf5c33d4e8a4c3663f7f7a63e537f7324036e85a528f713cd078cf2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-actuarialangle-doc"

RDEPENDS:${PN} += ""

inherit rpm
