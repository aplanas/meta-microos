SUMMARY = "Documentation for texlive-pmxchords"
DESCRIPTION = "This package includes the documentation for texlive-pmxchords"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.0.2svn39249"

RPM_NAME = "texlive-pmxchords-doc-2023.209.2.0.2svn39249-53.1.noarch.rpm"
RPM_HASH = "42ed77ede49d17bc57df5d0b270d5ac37e9a127af735a3d95a7d4aeb986bf36f6755522fd9a113a2afdc5824f4feb7f54caa410a98ffbd937d18a97d9d7aacd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pmxchords-doc-en;cs \
man-pmxchords.1 \
texlive-pmxchords-doc"

RDEPENDS:${PN} += ""

inherit rpm
