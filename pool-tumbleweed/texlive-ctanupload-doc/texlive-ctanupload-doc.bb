SUMMARY = "Documentation for texlive-ctanupload"
DESCRIPTION = "This package includes the documentation for texlive-ctanupload"
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.1.2csvn26313"

RPM_NAME = "texlive-ctanupload-doc-2023.204.1.2csvn26313-54.1.noarch.rpm"
RPM_HASH = "50c57a34e9c4e314e2a2eb9df2ae6fa00436c58eb87cfa3d45a1780b56eac396f52c4bb078e6842d5bc15cedc0bdd1483a3aaafe8179b67da75ded1c3b46a16a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ctanupload-doc"

RDEPENDS:${PN} += ""

inherit rpm
