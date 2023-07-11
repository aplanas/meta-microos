SUMMARY = "Documentation for texlive-ltxguidex"
DESCRIPTION = "This package includes the documentation for texlive-ltxguidex"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.2.0svn50992"

RPM_NAME = "texlive-ltxguidex-doc-2023.208.0.0.2.0svn50992-53.1.noarch.rpm"
RPM_HASH = "ca35cf1a02ee15e55cba1c5df377fccebc056cbe7fa1b49c44f46b3ec07b391101be1a096db2fbf0ae8739bb3c74abccaa086517c0379852c1f139ae40d3b73f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ltxguidex-doc"

RDEPENDS:${PN} += ""

inherit rpm
