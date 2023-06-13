SUMMARY = "Documentation for texlive-qcircuit"
DESCRIPTION = "This package includes the documentation for texlive-qcircuit"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.6.0svn48400"

RPM_NAME = "texlive-qcircuit-doc-2023.201.2.6.0svn48400-53.1.noarch.rpm"
RPM_HASH = "16cb4a043293649f8ab6659bf0b593ea54ed88b79a60c7d3bb024ad55a0b5175a0e9856f2e6f94bb09735c96a71345944b118324491dbe46f71dc95b970f6bbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qcircuit-doc"

RDEPENDS:${PN} += ""

inherit rpm
