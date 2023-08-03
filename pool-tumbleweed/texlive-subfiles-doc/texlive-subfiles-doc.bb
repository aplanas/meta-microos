SUMMARY = "Documentation for texlive-subfiles"
DESCRIPTION = "This package includes the documentation for texlive-subfiles"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2svn56977"

RPM_NAME = "texlive-subfiles-doc-2023.209.2.2svn56977-58.1.noarch.rpm"
RPM_HASH = "2281769a11dd4d987ac75947d06a45a7f047b5ac0a797a6168bcc94041f0a93f1a39a72af8c0feb27bc7a947350a663d5c5b0c3eb585417f12ad80868abaf8c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-subfiles-doc"

RDEPENDS:${PN} += ""

inherit rpm
