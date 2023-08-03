SUMMARY = "Documentation for texlive-metauml"
DESCRIPTION = "This package includes the documentation for texlive-metauml"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.2.6svn49923"

RPM_NAME = "texlive-metauml-doc-2023.209.0.0.2.6svn49923-55.1.noarch.rpm"
RPM_HASH = "bb0d97d65edc16647ab956c9e83dab6abffb0112a893e8f4cec61368ecc18ec32774b6a6ca328204963e534a88e02e98a2aed2084106af6343337e0fbe128f53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metauml-doc"

RDEPENDS:${PN} += ""

inherit rpm
