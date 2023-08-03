SUMMARY = "Documentation for texlive-typehtml"
DESCRIPTION = "This package includes the documentation for texlive-typehtml"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn17134"

RPM_NAME = "texlive-typehtml-doc-2023.209.svn17134-53.1.noarch.rpm"
RPM_HASH = "ec1f64ae048ad283f53159fedfbd50382c6dc22e8ea2beba28df090ca29b8eacea9a7b129c84c0554dd38d1b4f5761c520ab25abc401e82ecd1fc896ae1197dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-typehtml-doc"

RDEPENDS:${PN} += ""

inherit rpm
