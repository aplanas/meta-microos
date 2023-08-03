SUMMARY = "Array data structures for (La)TeX"
DESCRIPTION = "This package provides array data structures in (La)TeX, in the \
meaning of the classical procedural programming languages like \
Fortran, Ada or C, and macros to manipulate them. Arrays can be \
mono or bi-dimensional. This is useful for applications which \
require high level programming techniques, like algorithmic \
graphics programmed in the TeX language. The package supersedes \
the arrayjob package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.04svn18125"

RPM_NAME = "texlive-arrayjobx-2023.209.1.04svn18125-54.1.noarch.rpm"
RPM_HASH = "3a62c3a13630d3ea2d80fccb78de45ff294ab0fefc692977024c2526dcd70be5c3f40d0a26cf838dc489a7e0832b09fde35b8edd177261824c0e7379f9c8c342"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-arrayjob.sty \
tex-arrayjobx.sty \
texlive-arrayjobx"

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
