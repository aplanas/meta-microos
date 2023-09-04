SUMMARY = "Documentation for texlive-xlop"
DESCRIPTION = "This package includes the documentation for texlive-xlop"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.28svn56910"

RPM_NAME = "texlive-xlop-doc-2023.209.0.0.28svn56910-53.2.noarch.rpm"
RPM_HASH = "4a63dffa783cc39fa8d389234b23d5366e88b3192416c5becd82b2427eebb47313173b32ae77aa7417af43d53e67104db64376d6ed2c0ab51918e0b4588d9653"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xlop-doc-fr;en \
texlive-xlop-doc"

RDEPENDS:${PN} += ""

inherit rpm
