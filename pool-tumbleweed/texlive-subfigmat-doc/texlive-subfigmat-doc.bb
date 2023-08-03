SUMMARY = "Documentation for texlive-subfigmat"
DESCRIPTION = "This package includes the documentation for texlive-subfigmat"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn20308"

RPM_NAME = "texlive-subfigmat-doc-2023.209.1.0svn20308-58.1.noarch.rpm"
RPM_HASH = "c1fba8759cb2fc6eaec0e799748403aa49306e6a5fd82c63373865b071307aa52a4da0e9d2b82a406a405d0365ca1947b7beafc89e3b49d4c80e455772e3b6ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-subfigmat-doc"

RDEPENDS:${PN} += ""

inherit rpm
