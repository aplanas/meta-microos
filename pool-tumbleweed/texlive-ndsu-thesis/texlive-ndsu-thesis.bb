SUMMARY = "North Dakota State University disquisition class"
DESCRIPTION = "A class for generating disquisitions, intended to be in \
compliance with North Dakota State University requirements."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn46639"

RPM_NAME = "texlive-ndsu-thesis-2023.209.svn46639-55.1.noarch.rpm"
RPM_HASH = "bdb0cf816ebd6c4f53407b55f38752d083be5b8c3b746b54bbdb2cdddbc2145c200580514e6ab172aead363b2b9453842398515d6932b8554b486753bf85615c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ndsu-thesis.cls \
texlive-ndsu-thesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-book.cls \
tex-caption.sty \
tex-comment.sty \
tex-etoolbox.sty \
tex-geometry.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-indentfirst.sty \
tex-inputenc.sty \
tex-newfloat.sty \
tex-setspace.sty \
tex-tikz.sty \
tex-titlesec.sty \
tex-titling.sty \
tex-tocbibind.sty \
tex-tocloft.sty \
tex-totalcount.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
