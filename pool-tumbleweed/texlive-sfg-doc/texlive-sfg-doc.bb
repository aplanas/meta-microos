SUMMARY = "Documentation for texlive-sfg"
DESCRIPTION = "This package includes the documentation for texlive-sfg"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.91svn20209"

RPM_NAME = "texlive-sfg-doc-2023.209.0.0.91svn20209-54.1.noarch.rpm"
RPM_HASH = "164e31bc997dc271c3eaf26b3ab954cff4d6c4d0b669f0512bb70ff7d5ee0ecfd303b4eece437d9a1a4f68fe157d94ea1675d4946f330c38b1ad02305c6f0f06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sfg-doc"

RDEPENDS:${PN} += ""

inherit rpm
