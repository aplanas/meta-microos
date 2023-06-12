SUMMARY = "Documentation for texlive-qobitree"
DESCRIPTION = "This package includes the documentation for texlive-qobitree"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-qobitree-doc-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "79d6be36fbba33f9df2c611862a476dd40dc7097bfd54ca12acdfc50f474b2a6073a1f82b8559a04ce92b911c42a83a245a6fe32b075de0b1712ec842551807e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qobitree-doc"
RDEPENDS:${PN} += ""

inherit rpm
