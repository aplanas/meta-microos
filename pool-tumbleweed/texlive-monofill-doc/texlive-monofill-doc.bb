SUMMARY = "Documentation for texlive-monofill"
DESCRIPTION = "This package includes the documentation for texlive-monofill"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn28140"

RPM_NAME = "texlive-monofill-doc-2023.209.0.0.2svn28140-55.1.noarch.rpm"
RPM_HASH = "60bc55d88f1a8e197092316dd7abec223df4def1189007a2b61e387b485cd36f83319c2f85295601462e09132917c17b664aa4d65f49314215131fb3266f20c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-monofill-doc"

RDEPENDS:${PN} += ""

inherit rpm
