SUMMARY = "Documentation for texlive-xhfill"
DESCRIPTION = "This package includes the documentation for texlive-xhfill"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.01svn22575"

RPM_NAME = "texlive-xhfill-doc-2023.201.1.01svn22575-52.2.noarch.rpm"
RPM_HASH = "e563ef3664142f6af69d6ccd1edf289e3273f734ab2526529f0b6af1761f06e64406658ac57c469a7667b4a7667b6da16756d2ca6a46a47b8ee446017f7a9549"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xhfill-doc"

RDEPENDS:${PN} += ""

inherit rpm
