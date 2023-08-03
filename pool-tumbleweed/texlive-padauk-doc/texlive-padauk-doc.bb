SUMMARY = "Documentation for texlive-padauk"
DESCRIPTION = "This package includes the documentation for texlive-padauk"
LICENSE = "OFL-1.1"

PV = "2023.209.3.002svn42617"

RPM_NAME = "texlive-padauk-doc-2023.209.3.002svn42617-52.1.noarch.rpm"
RPM_HASH = "dcc66da85c5a2705072917ec5efed4d8517e27d44529a4f5c0f3af6ecbc18fe40d94ae664fadf45d543b6dcd4df8b510214a81a914855f6de33639081786e330"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-padauk-doc"

RDEPENDS:${PN} += ""

inherit rpm
