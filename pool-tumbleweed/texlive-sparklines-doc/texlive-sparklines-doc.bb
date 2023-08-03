SUMMARY = "Documentation for texlive-sparklines"
DESCRIPTION = "This package includes the documentation for texlive-sparklines"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.7svn42821"

RPM_NAME = "texlive-sparklines-doc-2023.209.1.7svn42821-58.1.noarch.rpm"
RPM_HASH = "6cf5b628761cf11e55e16b2d373e04d20b12373b016fd72ebef0569067f19c9cf15379543dc838153051848816054fee724fe844daf7532821b0a6ec220d7d20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sparklines-doc"

RDEPENDS:${PN} += ""

inherit rpm
