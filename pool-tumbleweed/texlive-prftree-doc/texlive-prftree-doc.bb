SUMMARY = "Documentation for texlive-prftree"
DESCRIPTION = "This package includes the documentation for texlive-prftree"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.6svn54080"

RPM_NAME = "texlive-prftree-doc-2023.201.1.6svn54080-52.1.noarch.rpm"
RPM_HASH = "4531cf8da37803ea4d600353ecf1a63e19179905022afef8876a710391c3b75f9826e85e75d0db197598fb4d03f6b5d532d43da739c14e62cccf4ad92fd173d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-prftree-doc"
RDEPENDS:${PN} += ""

inherit rpm
