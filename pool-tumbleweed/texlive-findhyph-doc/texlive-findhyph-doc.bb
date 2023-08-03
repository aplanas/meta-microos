SUMMARY = "Documentation for texlive-findhyph"
DESCRIPTION = "This package includes the documentation for texlive-findhyph"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.3.4svn47444"

RPM_NAME = "texlive-findhyph-doc-2023.209.3.4svn47444-53.1.noarch.rpm"
RPM_HASH = "d595111eb12dd18903b3c52bfce35a546f826076f9ac50a1107cdd3a91b21931cdef4e0f21a8366ead2a9d7ee705358e794110e06319c9f73575331cb78ba0af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-findhyph.1 \
texlive-findhyph-doc"

RDEPENDS:${PN} += ""

inherit rpm
