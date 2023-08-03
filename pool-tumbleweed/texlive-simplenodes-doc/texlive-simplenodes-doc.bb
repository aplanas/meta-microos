SUMMARY = "Documentation for texlive-simplenodes"
DESCRIPTION = "This package includes the documentation for texlive-simplenodes"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn62888"

RPM_NAME = "texlive-simplenodes-doc-2023.209.svn62888-54.1.noarch.rpm"
RPM_HASH = "474320366a34cf3357ac5080a9aeed0bb493d00e9a09e2729d591a11f584b4c8e59606e00bfc9edcd0f445f6674c488eed6532fd6c390d0be20dc9bd54e95039"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-simplenodes-doc"

RDEPENDS:${PN} += ""

inherit rpm
