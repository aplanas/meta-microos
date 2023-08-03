SUMMARY = "Index entries by key lookup"
DESCRIPTION = "The package provides functionality for producing an index \
without directly entering index entries into the text using the \
\\index command, but instead by looking up short keys and \
printing a predefined string in the main text and adding a \
corresponding index entry. The standard use case is the \
production of an index of names."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn50828"

RPM_NAME = "texlive-keyindex-2023.209.1.0svn50828-56.1.noarch.rpm"
RPM_HASH = "a0f2d1543c006677f910cb56b70a37235c218d2e6875625329f875160095a76b9fccdfc2cd793db73a2cb25a405f918b3bf263862feabbe89495c3ca881e75d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-keyindex.sty \
texlive-keyindex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
