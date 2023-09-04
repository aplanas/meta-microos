SUMMARY = "Documentation for texlive-xcntperchap"
DESCRIPTION = "This package includes the documentation for texlive-xcntperchap"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn54080"

RPM_NAME = "texlive-xcntperchap-doc-2023.209.0.0.5svn54080-53.2.noarch.rpm"
RPM_HASH = "c0e32e65ae2b7ea85c657c4961f33d8e743bac869b79f3c8ddd8d5d455a2fabe3bb9ae2b1b18957dfdab2bf2306d336c133d28646fa99613bcf39978420811c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xcntperchap-doc"

RDEPENDS:${PN} += ""

inherit rpm
