SUMMARY = "Documentation for texlive-stage"
DESCRIPTION = "This package includes the documentation for texlive-stage"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.03svn62929"

RPM_NAME = "texlive-stage-doc-2023.201.1.03svn62929-57.1.noarch.rpm"
RPM_HASH = "ea242023a5c052351cbab3f91d7e8882a3316518bf8563d9ae805efbf4101ea6ba7354fc95d84d4cea08d6e9ed8b4b9c6edc559b15d21e27f78150602d53016c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stage-doc"

RDEPENDS:${PN} += ""

inherit rpm
