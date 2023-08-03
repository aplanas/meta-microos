SUMMARY = "Documentation for texlive-versonotes"
DESCRIPTION = "This package includes the documentation for texlive-versonotes"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn55777"

RPM_NAME = "texlive-versonotes-doc-2023.209.0.0.4svn55777-54.1.noarch.rpm"
RPM_HASH = "33eb6b3f57d9dc867f28a5ca5703359a60c1e87c235f81b3016f97ebee2531399a67069cec0e37dee1738d8ec27f35b6604548790dd3251c75dad955d2dee335"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-versonotes-doc"

RDEPENDS:${PN} += ""

inherit rpm
