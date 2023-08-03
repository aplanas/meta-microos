SUMMARY = "Documentation for texlive-musixtex"
DESCRIPTION = "This package includes the documentation for texlive-musixtex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.36svn65519"

RPM_NAME = "texlive-musixtex-doc-2023.209.1.36svn65519-55.1.noarch.rpm"
RPM_HASH = "30fbe26d9bca89d8246751c9bc39e3f03d726d265ff9d81177045288a5e8c349b1d51d5d744702dea8d38ecf664df12287829fecb3bc8a3cd8442742ce98935a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-musixflx.1 \
man-musixtex.1 \
texlive-musixtex-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
