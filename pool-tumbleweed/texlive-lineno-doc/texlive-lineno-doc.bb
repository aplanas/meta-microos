SUMMARY = "Documentation for texlive-lineno"
DESCRIPTION = "This package includes the documentation for texlive-lineno"
LICENSE = "LPPL-1.0"

PV = "2023.209.5.1svn65586"

RPM_NAME = "texlive-lineno-doc-2023.209.5.1svn65586-55.1.noarch.rpm"
RPM_HASH = "4091f7535e93c5828572f325983f0a8257f65a0a514cdcf573f399347f9e9d8d3a484f9637061a1572079d0eddc9500924902a3c84f13ebbe087cd3322e4b35c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lineno-doc"

RDEPENDS:${PN} += ""

inherit rpm
