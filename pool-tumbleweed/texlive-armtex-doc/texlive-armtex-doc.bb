SUMMARY = "Documentation for texlive-armtex"
DESCRIPTION = "This package includes the documentation for texlive-armtex"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.0_beta4svn64182"

RPM_NAME = "texlive-armtex-doc-2023.209.3.0_beta4svn64182-55.1.noarch.rpm"
RPM_HASH = "3b64f311b21a09d0b0750ba22eba910c623296e2b524549bc37a13909eb1a4bfd8deea8db958ea0bc3f2b8c028214d0598302bd6c359e5478c21e56273aeeaf2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-armtex-doc-en;hy \
texlive-armtex-doc"

RDEPENDS:${PN} += ""

inherit rpm
