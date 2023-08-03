SUMMARY = "Documentation for texlive-biblatex-unified"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-unified"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.20svn64975"

RPM_NAME = "texlive-biblatex-unified-doc-2023.209.1.20svn64975-54.1.noarch.rpm"
RPM_HASH = "f48a7a34adc4b4671781a3e99b7d4252caf3cc3f8bfad0ca468492d269eecf8cb42f9f4a33e8f67020ebc43162d3198fe3beadba8f8ed48e9880b3378f9f46b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-unified-doc"

RDEPENDS:${PN} += ""

inherit rpm
