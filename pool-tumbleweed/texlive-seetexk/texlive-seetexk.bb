SUMMARY = "Utilities for manipulating DVI files"
DESCRIPTION = "The collection comprises: dvibook, which will rearrange the \
pages of a DVI file into 'signatures' as used when printing a \
book; dviconcat, for concatenating pages of DVI file(s); \
dviselect, which will select pages from one DVI file to create \
a new DVI file; dvitodvi, which will rearrange the pages of a \
DVI file to create a new file; and libtex, a library for \
manipulating the files, from the old SeeTeX project. The \
utilities are provided as C source with Imakefiles, and an \
MS-DOS version of dvibook is also provided."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn57972"

RPM_NAME = "texlive-seetexk-2023.209.svn57972-54.1.noarch.rpm"
RPM_HASH = "4022f60952efb840f0e42ab9ab8748679858a2d7f684203c5d55d2f21069c3f785421b60d748a1a1b270da8d9190e29c609781ad86e6d7bc2f487eb9d0861ac2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-dvibook.1 \
man-dviconcat.1 \
man-dviselect.1 \
man-dvitodvi.1 \
texlive-seetexk"

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
texlive-scripts-bin \
texlive-seetexk-bin"

inherit rpm
