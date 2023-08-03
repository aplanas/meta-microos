SUMMARY = "Documentation for texlive-doipubmed"
DESCRIPTION = "This package includes the documentation for texlive-doipubmed"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.01svn15878"

RPM_NAME = "texlive-doipubmed-doc-2023.209.1.01svn15878-53.1.noarch.rpm"
RPM_HASH = "288903ffb4b645fff5a3459aa8cf7f803b8cd5dbd45b6e114c09b6d24f3e953dbbf9983b18ba96aacecdfbe24e79adf2037d3a10469e61c5e05c0dbc63c99050"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-doipubmed-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
