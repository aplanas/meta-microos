SUMMARY = "Documentation for texlive-idxlayout"
DESCRIPTION = "This package includes the documentation for texlive-idxlayout"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.4dsvn25821"

RPM_NAME = "texlive-idxlayout-doc-2023.208.0.0.4dsvn25821-53.1.noarch.rpm"
RPM_HASH = "3c99fb36383d24f248eeece68f729ae2229637050eb8b99d70fc66454ecef15c76d036c19068d8e92c37bd9e64b09beced0230595f9530581151a0b74dd988f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-idxlayout-doc-en \
texlive-idxlayout-doc"

RDEPENDS:${PN} += ""

inherit rpm
