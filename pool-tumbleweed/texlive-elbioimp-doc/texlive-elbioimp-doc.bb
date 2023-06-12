SUMMARY = "Documentation for texlive-elbioimp"
DESCRIPTION = "This package includes the documentation for texlive-elbioimp"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn21758"

RPM_NAME = "texlive-elbioimp-doc-2023.201.1.2svn21758-53.1.noarch.rpm"
RPM_HASH = "832818d6ae8fb12c7aa1f45978557a7beb561df798ccc3244ecdb15521386f1233354572818bb33bdc97fa0251e5fdaab84c150d7150f1e9eea86eae5c4eba56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-elbioimp-doc"
RDEPENDS:${PN} += ""

inherit rpm
