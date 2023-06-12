SUMMARY = "Documentation for texlive-parades"
DESCRIPTION = "This package includes the documentation for texlive-parades"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn40042"

RPM_NAME = "texlive-parades-doc-2023.201.svn40042-51.1.noarch.rpm"
RPM_HASH = "00138b0e5f18b3b8fb5640b5829531424953c5dad7c84c10f18c9c7cbb31eed7c4259d6e9aa2aa2b1b09ca57673a1cd3477a4cd271f8ddb764b0e39a3eec1551"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-parades-doc"
RDEPENDS:${PN} += ""

inherit rpm
