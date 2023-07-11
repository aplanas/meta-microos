SUMMARY = "Documentation for texlive-mcite"
DESCRIPTION = "This package includes the documentation for texlive-mcite"
LICENSE = "GPL-2.0-or-later"

PV = "2023.208.1.6svn18173"

RPM_NAME = "texlive-mcite-doc-2023.208.1.6svn18173-53.1.noarch.rpm"
RPM_HASH = "e8eca3d3a86276f5709daa775d0bc4429db31888fb1b72b214df6b7a142c106131ac5e272a0478c1505035e245ab4d59fedd407cfbc72280be01a3423829c264"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mcite-doc"

RDEPENDS:${PN} += ""

inherit rpm
