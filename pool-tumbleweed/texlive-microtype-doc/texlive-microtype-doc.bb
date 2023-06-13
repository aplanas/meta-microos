SUMMARY = "Documentation for texlive-microtype"
DESCRIPTION = "This package includes the documentation for texlive-microtype"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1asvn66587"

RPM_NAME = "texlive-microtype-doc-2023.201.3.1asvn66587-54.1.noarch.rpm"
RPM_HASH = "4cbe6ee3bbd497ed84af9877b8da59fcb0431032e3973d246a9ac0a5721a3a4b2002bc566d049695cdbd228f24f300afc0b01f9712ee5b8d356807b766422265"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-microtype-doc"

RDEPENDS:${PN} += ""

inherit rpm
