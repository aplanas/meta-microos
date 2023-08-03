SUMMARY = "A small collection of minimal DTX examples"
DESCRIPTION = "A collection of files that demonstrate simple things that are \
possible with the flexible and under-appreciated docstrip file \
format. Each file of the collection is provided as a .dtx file \
and as the corresponding .pdf. The set is intended as a \
companion to Scott Pakin's excellent and influential dtxtut \
example of producing LaTeX packages in this way."
LICENSE = "LPPL-1.0"

PV = "2023.209.1svn49504"

RPM_NAME = "texlive-dtxgallery-2023.209.1svn49504-53.1.noarch.rpm"
RPM_HASH = "e57c082094734c3354c8d71909418d1d8955b3f496387a4867a5b388e19e14a2bcfd3ddf04082a722f50aed069483ccf56995d8982ddd3a383ae6e8735edcb6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dtxgallery \
texlive-dtxgallery-doc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
