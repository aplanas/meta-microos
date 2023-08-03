SUMMARY = "Documentation for texlive-moderntimeline"
DESCRIPTION = "This package includes the documentation for texlive-moderntimeline"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.11svn55518"

RPM_NAME = "texlive-moderntimeline-doc-2023.209.0.0.11svn55518-55.1.noarch.rpm"
RPM_HASH = "96cd97446e993e8b0f24d775732d223ea6d119a708e3d878af379334864dee93b385f37db09c9b87351b40ff8e3dc1022e1b713d4c0bbf50279399699f52cfa0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-moderntimeline-doc"

RDEPENDS:${PN} += ""

inherit rpm
