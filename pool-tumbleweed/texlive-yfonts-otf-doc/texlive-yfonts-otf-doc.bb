SUMMARY = "Documentation for texlive-yfonts-otf"
DESCRIPTION = "This package includes the documentation for texlive-yfonts-otf"
LICENSE = "OFL-1.1"

PV = "2023.209.0.0.43svn65030"

RPM_NAME = "texlive-yfonts-otf-doc-2023.209.0.0.43svn65030-53.2.noarch.rpm"
RPM_HASH = "c64680247af144a57507e32bc01dc1ba1351740cc8fea5a1454896cab8f0b3a2c7e2fe07e8a520ec3e7b91730c9994eccd65770d3293dbc7ea3c12cb1bfbb86c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yfonts-otf-doc"

RDEPENDS:${PN} += ""

inherit rpm
