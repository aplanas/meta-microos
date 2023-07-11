SUMMARY = "Documentation for texlive-hrefhide"
DESCRIPTION = "This package includes the documentation for texlive-hrefhide"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1asvn66189"

RPM_NAME = "texlive-hrefhide-doc-2023.201.1.1asvn66189-53.2.noarch.rpm"
RPM_HASH = "e65584486596c01514621a45a6a75f286425dabfce20f557b8f11b570d181393453dc04d76b60ae35fbe56a151825342ee64d3b7fc93bf85ed35670a2a7a5922"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hrefhide-doc"

RDEPENDS:${PN} += ""

inherit rpm
