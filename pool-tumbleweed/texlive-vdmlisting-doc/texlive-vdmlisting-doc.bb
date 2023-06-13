SUMMARY = "Documentation for texlive-vdmlisting"
DESCRIPTION = "This package includes the documentation for texlive-vdmlisting"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn56905"

RPM_NAME = "texlive-vdmlisting-doc-2023.201.1.1svn56905-53.1.noarch.rpm"
RPM_HASH = "b8e05e345a60c798922ddfdc027958b3e9301acfabdad4bf26aa5705128d2aa989698cf0a306c96576e8221ed633e6c456f36d57560fac8fe76fef2e5e046bcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-vdmlisting-doc"

RDEPENDS:${PN} += ""

inherit rpm
