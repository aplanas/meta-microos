SUMMARY = "Documentation for texlive-nodetree"
DESCRIPTION = "This package includes the documentation for texlive-nodetree"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2.1svn65298"

RPM_NAME = "texlive-nodetree-doc-2023.201.2.2.1svn65298-54.1.noarch.rpm"
RPM_HASH = "48f1928e2dea3598dfcd987db4d48b23b8ea61ac483f8498cb610cc0a21aa323c65671af9f4e7f4a58e196224f0a040d050c8846624bb83be7da292b1dddbdaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nodetree-doc"

RDEPENDS:${PN} += ""

inherit rpm
