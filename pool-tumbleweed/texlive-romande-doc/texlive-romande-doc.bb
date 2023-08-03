SUMMARY = "Documentation for texlive-romande"
DESCRIPTION = "This package includes the documentation for texlive-romande"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.008_v7_scsvn19537"

RPM_NAME = "texlive-romande-doc-2023.209.1.008_v7_scsvn19537-54.1.noarch.rpm"
RPM_HASH = "5141fcaa412c77aa8fef2cb847a45ca995f114bf326155baf218f43439ecc5e6849aa2e4a2fa3425d8b39249c048b1e11c1f4c201d80e7ae90e319bebb513dee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-romande-doc"

RDEPENDS:${PN} += ""

inherit rpm
