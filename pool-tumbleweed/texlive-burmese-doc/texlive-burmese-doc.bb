SUMMARY = "Documentation for texlive-burmese"
DESCRIPTION = "This package includes the documentation for texlive-burmese"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn25185"

RPM_NAME = "texlive-burmese-doc-2023.209.svn25185-53.1.noarch.rpm"
RPM_HASH = "1ed7420d03ebacaeddc7d30aaaf58c118f4453d98bb79d06ce6eb973bb9c1aa906435696f162b217a4b973ce6ad23edd26e2d2afd7fd625926fe071b7dd4c978"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-burmese-doc"

RDEPENDS:${PN} += ""

inherit rpm
