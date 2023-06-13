SUMMARY = "Documentation for texlive-a0poster"
DESCRIPTION = "This package includes the documentation for texlive-a0poster"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.22bsvn54071"

RPM_NAME = "texlive-a0poster-doc-2023.201.1.22bsvn54071-54.1.noarch.rpm"
RPM_HASH = "803c92070a5ec7057390147c7ac38ca737cf2415dd4f1df29b82e4f4cf510ca2afd033b6bf48ed44329dc6d35efc38b9a6c560e4689f6fe81cf349663470eb4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-a0poster-doc:de;en) \
texlive-a0poster-doc"

RDEPENDS:${PN} += ""

inherit rpm
