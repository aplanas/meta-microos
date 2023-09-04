SUMMARY = "Documentation for texlive-indextools"
DESCRIPTION = "This package includes the documentation for texlive-indextools"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5.1svn38931"

RPM_NAME = "texlive-indextools-doc-2023.209.1.5.1svn38931-54.1.noarch.rpm"
RPM_HASH = "2f6d90eae514bccf0e4c524109b9801a8a9665a4817ff762b93740be7361557a0482440987601f221278579a7d591fd9bb0e4599113446a13b953f93ec2f3c18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-indextools-doc"

RDEPENDS:${PN} += ""

inherit rpm
