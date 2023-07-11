SUMMARY = "Documentation for texlive-ibrackets"
DESCRIPTION = "This package includes the documentation for texlive-ibrackets"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.1svn65383"

RPM_NAME = "texlive-ibrackets-doc-2023.208.1.1svn65383-53.1.noarch.rpm"
RPM_HASH = "ab6f116fd3bbfd29830b510ce58beaf2a25cb6130b1db5739853d5ca3b82c79bb06d0e4a0c36c14edee195cdf2bb5960f47d67156144e954593a869af072a11b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ibrackets-doc"

RDEPENDS:${PN} += ""

inherit rpm
