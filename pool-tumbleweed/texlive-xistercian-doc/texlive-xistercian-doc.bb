SUMMARY = "Documentation for texlive-xistercian"
DESCRIPTION = "This package includes the documentation for texlive-xistercian"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn61366"

RPM_NAME = "texlive-xistercian-doc-2023.201.1.2svn61366-52.2.noarch.rpm"
RPM_HASH = "13653e7fab79dd05f12a906a010275f6a0e5685681c0fede3744d3bcccedd7e9ad8a76fbea0d6c3befe726a6b187108ae1bd1bdc9b334c1f3f85a227d611f48a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xistercian-doc"

RDEPENDS:${PN} += ""

inherit rpm
