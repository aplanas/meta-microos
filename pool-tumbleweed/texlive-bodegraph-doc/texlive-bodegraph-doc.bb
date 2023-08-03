SUMMARY = "Documentation for texlive-bodegraph"
DESCRIPTION = "This package includes the documentation for texlive-bodegraph"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn61719"

RPM_NAME = "texlive-bodegraph-doc-2023.209.1.4svn61719-53.1.noarch.rpm"
RPM_HASH = "a584847c7154971fe56835ac96add7163ef4898d9ff93c896abc222561c068276687f96cd2f830c95ca7d3ee1e1aa647edb77a95242e776e40661989b2b4ba3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bodegraph-doc"

RDEPENDS:${PN} += ""

inherit rpm
