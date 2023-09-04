SUMMARY = "Documentation for texlive-dyntree"
DESCRIPTION = "This package includes the documentation for texlive-dyntree"
LICENSE = "LGPL-2.1-or-later"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-dyntree-doc-2023.209.1.0svn15878-54.2.noarch.rpm"
RPM_HASH = "30ca78b74ad2b83d1cb75a5788d1696559e71c81bcc5ebee6bf35d30883945cc3d3f0a1a33d3bdc63c947a2a091361c047eb2439b9c9e9aed4450e0f48db871c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dyntree-doc"

RDEPENDS:${PN} += ""

inherit rpm
