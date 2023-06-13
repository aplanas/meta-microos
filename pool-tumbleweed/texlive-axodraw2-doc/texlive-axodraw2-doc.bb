SUMMARY = "Documentation for texlive-axodraw2"
DESCRIPTION = "This package includes the documentation for texlive-axodraw2"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.1.1csvn58155"

RPM_NAME = "texlive-axodraw2-doc-2023.201.2.1.1csvn58155-53.1.noarch.rpm"
RPM_HASH = "7c6fd96192b070ffbf34744c4a8afc2ed4b9d12373aa543f4d8a3c038706d3136823b73f67a650416fe5e3660772802be6bc434505a143176d115462859a2ace"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(axohelp.1) \
texlive-axodraw2-doc"

RDEPENDS:${PN} += ""

inherit rpm
