SUMMARY = "Documentation for texlive-textualicomma"
DESCRIPTION = "This package includes the documentation for texlive-textualicomma"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn48474"

RPM_NAME = "texlive-textualicomma-doc-2023.209.1.1svn48474-55.1.noarch.rpm"
RPM_HASH = "21302b68cab8e2f11d7bd06a73bd31becc8027ed5b591eb317b68e4b80812170f99cf849c7a20dba2ee863186dfe49bb577fc066a93055948144b72eb41917b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-textualicomma-doc"

RDEPENDS:${PN} += ""

inherit rpm
