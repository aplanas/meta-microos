SUMMARY = "Documentation for texlive-astro"
DESCRIPTION = "This package includes the documentation for texlive-astro"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.20svn15878"

RPM_NAME = "texlive-astro-doc-2023.209.2.20svn15878-54.1.noarch.rpm"
RPM_HASH = "63e31ee2f94587a2314d378a35190438806ed6523f03ff9cd198d33bfb3eb07b2dc3ad47cec8347baaa93a5b2475dad9b306c54f1cffc52ff228ce6c9fb7e7e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-astro-doc"

RDEPENDS:${PN} += ""

inherit rpm
