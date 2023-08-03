SUMMARY = "Documentation for texlive-dblfloatfix"
DESCRIPTION = "This package includes the documentation for texlive-dblfloatfix"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0asvn28983"

RPM_NAME = "texlive-dblfloatfix-doc-2023.209.1.0asvn28983-53.1.noarch.rpm"
RPM_HASH = "c18e6d06e11e73eef78cbaf171150c0fbff7e8ddb90d0b86d5e2e7b5ef6d89d36c74650cb7ffe6bf90bd0af564eb56fa680b1ef36e41713ed8c0e4803fb03a50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dblfloatfix-doc"

RDEPENDS:${PN} += ""

inherit rpm
