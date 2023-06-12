SUMMARY = "Documentation for texlive-pxpic"
DESCRIPTION = "This package includes the documentation for texlive-pxpic"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn65803"

RPM_NAME = "texlive-pxpic-doc-2023.201.1.4svn65803-53.1.noarch.rpm"
RPM_HASH = "4dea4af65d94a01363de83944a90e7974e6b03b646bc302cf199fbda26642818ca0c72c7d9c6216fcaaf5bb5f912252fc82c3128f9acd1121ffa85acab8b6960"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pxpic-doc"
RDEPENDS:${PN} += ""

inherit rpm
