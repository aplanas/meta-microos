SUMMARY = "Documentation for texlive-gchords"
DESCRIPTION = "This package includes the documentation for texlive-gchords"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.20svn29803"

RPM_NAME = "texlive-gchords-doc-2023.201.1.20svn29803-52.1.noarch.rpm"
RPM_HASH = "017b20ad48ce3d6f1ee1033b8d321e0c385e316d5257045210ed40e300082b6c9af92ac4df78562ea91d17ef41d23870fe4dea2f466263b7fc2aebb7bd98837b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gchords-doc"

RDEPENDS:${PN} += ""

inherit rpm
