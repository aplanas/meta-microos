SUMMARY = "Documentation for texlive-ps2eps"
DESCRIPTION = "This package includes the documentation for texlive-ps2eps"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.70svn62856"

RPM_NAME = "texlive-ps2eps-doc-2023.201.1.70svn62856-52.1.noarch.rpm"
RPM_HASH = "aad5bd9bd5d2d0bcf2ad9f35a7753ba9f13e3402fb12bcea31cdc702fe0bd85be3969c7087ab7c82f1855905552ffa67203784095ff4daa0df74031f04c18c50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-bbox.1 \
man-ps2eps.1 \
texlive-ps2eps-doc \
texlive-pstools-doc-/usr/share/man/man1/bbox.1.gz \
texlive-pstools-doc-/usr/share/man/man1/ps2eps.1.gz"

RDEPENDS:${PN} += ""

inherit rpm
