SUMMARY = "Documentation for texlive-pb-diagram"
DESCRIPTION = "This package includes the documentation for texlive-pb-diagram"
LICENSE = "LPPL-1.0"

PV = "2023.209.5.0svn15878"

RPM_NAME = "texlive-pb-diagram-doc-2023.209.5.0svn15878-52.1.noarch.rpm"
RPM_HASH = "d3dab6a97d95d1426da23e66b1c843f2830d99af14665c0e609cd8e526a85e2f953fed7cffab6c134b4fa9292df9e02a8396f9490346de8b3da70f958b369814"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pb-diagram-doc"

RDEPENDS:${PN} += ""

inherit rpm
