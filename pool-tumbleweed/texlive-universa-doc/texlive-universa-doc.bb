SUMMARY = "Documentation for texlive-universa"
DESCRIPTION = "This package includes the documentation for texlive-universa"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.1svn51984"

RPM_NAME = "texlive-universa-doc-2023.201.2.1svn51984-53.1.noarch.rpm"
RPM_HASH = "923751fac913d98cecfadbf535610a99eb057910c0c7fd7312dbb49623d52b9b8fd14e1c9bb49b3007f69c41d177f97e60559dcc8b7c2f7aa42138108ae1893e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-universa-doc"

RDEPENDS:${PN} += ""

inherit rpm
