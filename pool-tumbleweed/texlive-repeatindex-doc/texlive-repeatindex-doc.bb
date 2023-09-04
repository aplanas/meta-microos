SUMMARY = "Documentation for texlive-repeatindex"
DESCRIPTION = "This package includes the documentation for texlive-repeatindex"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.01svn24305"

RPM_NAME = "texlive-repeatindex-doc-2023.209.0.0.01svn24305-54.2.noarch.rpm"
RPM_HASH = "ff732e5224542f88c49ba4104e811e24844d5f2f43cda9fc8a1ee8fc7ab041bd17ce3c0d2589a209973ba43f14d472bbd60f3a55bbaf4293818174dd63cb1535"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-repeatindex-doc"

RDEPENDS:${PN} += ""

inherit rpm
