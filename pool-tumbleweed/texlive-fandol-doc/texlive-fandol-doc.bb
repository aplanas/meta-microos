SUMMARY = "Documentation for texlive-fandol"
DESCRIPTION = "This package includes the documentation for texlive-fandol"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.3svn37889"

RPM_NAME = "texlive-fandol-doc-2023.209.0.0.3svn37889-53.1.noarch.rpm"
RPM_HASH = "88903b7b1f34beb3bdba14c71d54257cfff85d3a60829b44b5176f21113b861161d83fd92344c86628940ccb2a2c0fa5f4967ac3ad50157a96925fc37fba37b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fandol-doc"

RDEPENDS:${PN} += ""

inherit rpm
