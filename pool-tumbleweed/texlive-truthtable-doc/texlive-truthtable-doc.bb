SUMMARY = "Documentation for texlive-truthtable"
DESCRIPTION = "This package includes the documentation for texlive-truthtable"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.0.2svn60717"

RPM_NAME = "texlive-truthtable-doc-2023.209.0.0.0.2svn60717-53.1.noarch.rpm"
RPM_HASH = "fe742a95ca8c7055614966ce85d6e25ad8b5d8a3d751485de17bcf7eb14def7f49799ca1a891e82b9995317de2b3a3e32f11be36b1c06e5c1123732f1f6ca617"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-truthtable-doc"

RDEPENDS:${PN} += ""

inherit rpm
