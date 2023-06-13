SUMMARY = "Documentation for texlive-endnotes"
DESCRIPTION = "This package includes the documentation for texlive-endnotes"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn53319"

RPM_NAME = "texlive-endnotes-doc-2023.201.svn53319-53.1.noarch.rpm"
RPM_HASH = "0fad22841c22d6950622653e5f98a66eb84ddad63d1e0af51529dd87277f19ecc8564a681b149a9baaa5f26dd45a778e5456c447d2bb9018241807f53dba4f93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-endnotes-doc"

RDEPENDS:${PN} += ""

inherit rpm
