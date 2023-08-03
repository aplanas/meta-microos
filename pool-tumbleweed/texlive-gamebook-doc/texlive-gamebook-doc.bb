SUMMARY = "Documentation for texlive-gamebook"
DESCRIPTION = "This package includes the documentation for texlive-gamebook"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn24714"

RPM_NAME = "texlive-gamebook-doc-2023.209.1.0svn24714-53.1.noarch.rpm"
RPM_HASH = "d6a3535c91e5e7d472573b9461fde37cbd032c504b32026251e6b03ed78bc580c747718b35106da76be47d6c125cc71e38b5a8d7497d63bd4d0cec664701ef22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gamebook-doc"

RDEPENDS:${PN} += ""

inherit rpm
