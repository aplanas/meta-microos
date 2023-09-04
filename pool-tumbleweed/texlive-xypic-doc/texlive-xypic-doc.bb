SUMMARY = "Documentation for texlive-xypic"
DESCRIPTION = "This package includes the documentation for texlive-xypic"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.3.8.9svn61719"

RPM_NAME = "texlive-xypic-doc-2023.209.3.8.9svn61719-53.2.noarch.rpm"
RPM_HASH = "1e1271a29b6b13ab11f7625f04fb222c5b28a6374812fef705aee32ed28bd3eb28524f5cdd80346e7f70ea78996a3d7e7b37f55d2c80ef8e850067ef39b19ac1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xypic-doc-en \
texlive-xypic-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
