SUMMARY = "Documentation for texlive-carlito"
DESCRIPTION = "This package includes the documentation for texlive-carlito"
LICENSE = "OFL-1.1"

PV = "2023.209.svn64624"

RPM_NAME = "texlive-carlito-doc-2023.209.svn64624-53.1.noarch.rpm"
RPM_HASH = "bdcf7b6441fd7f5c73473d838c7a45ce6dd461fbc557df72998458a4e757dfbf3cfee3b35afacc1af213fba8c01ea18c0551d17c43a379cf176c2ad1b74fd745"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-carlito-doc"

RDEPENDS:${PN} += ""

inherit rpm
