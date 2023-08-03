SUMMARY = "Documentation for texlive-exercises"
DESCRIPTION = "This package includes the documentation for texlive-exercises"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn55188"

RPM_NAME = "texlive-exercises-doc-2023.209.1.1svn55188-53.1.noarch.rpm"
RPM_HASH = "33bacf8640f7308b70afc1a234ea6c4e1e58dcd0a4088e95544e80e12dc0f104e7dd47c0a538271cfbf49a625645baf1a49da241c1c8a5506f9194d957fb540b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-exercises-doc"

RDEPENDS:${PN} += ""

inherit rpm
