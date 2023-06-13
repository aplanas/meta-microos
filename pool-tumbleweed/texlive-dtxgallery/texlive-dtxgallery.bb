SUMMARY = "A small collection of minimal DTX examples"
DESCRIPTION = "A collection of files that demonstrate simple things that are \
possible with the flexible and under-appreciated docstrip file \
format. Each file of the collection is provided as a .dtx file \
and as the corresponding .pdf. The set is intended as a \
companion to Scott Pakin's excellent and influential dtxtut \
example of producing LaTeX packages in this way."
LICENSE = "LPPL-1.0"

PV = "2023.201.1svn49504"

RPM_NAME = "texlive-dtxgallery-2023.201.1svn49504-52.1.noarch.rpm"
RPM_HASH = "4b9e468e75c1b4c72e8992e0f88029622cc6e92fef2cae9d6197d6376e031494cc867621269da8dbaea82752dd57b6b15148cb53f4e871ef5c99a4acae7cf548"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dtxgallery \
texlive-dtxgallery-doc"

RDEPENDS:${PN} += "/bin/sh \
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
