SUMMARY = "Documentation for texlive-ps2eps"
DESCRIPTION = "This package includes the documentation for texlive-ps2eps"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.70svn62856"

RPM_NAME = "texlive-ps2eps-doc-2023.209.1.70svn62856-53.1.noarch.rpm"
RPM_HASH = "21dbf3444f6dc393864daf35c69cd1653fc60a771c2d0e85319ddef1a4c0164cecee7dcd01474b41de611592783947af8a3605a2dbed51197e15bc5ed1651897"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-bbox.1 \
man-ps2eps.1 \
texlive-ps2eps-doc \
texlive-pstools-doc-/usr/share/man/man1/bbox.1.gz \
texlive-pstools-doc-/usr/share/man/man1/ps2eps.1.gz"

RDEPENDS:${PN} += ""

inherit rpm
