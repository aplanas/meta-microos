SUMMARY = "Documentation for texlive-standalone"
DESCRIPTION = "This package includes the documentation for texlive-standalone"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3bsvn64677"

RPM_NAME = "texlive-standalone-doc-2023.209.1.3bsvn64677-58.1.noarch.rpm"
RPM_HASH = "27c20e90631eb0a3c14c3d1bf8ab411e6c9fbd67116fcaa6880c7c3fbe5a6851c8d7e3b3f2ebbad27f220fe85f39029e6e2510280a5ab49021a9f94a3a23b02a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-standalone-doc"

RDEPENDS:${PN} += ""

inherit rpm
