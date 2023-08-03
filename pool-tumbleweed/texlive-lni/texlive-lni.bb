SUMMARY = "Official class for the 'Lecture Notes in Informatics'"
DESCRIPTION = "This is the official version of the class 'lni' for submissions \
to the Lecture Notes in Informatics published by the \
Gesellschaft fur Informatik. To use it, download the file \
lni-author-template.tex and edit it in your favorite LaTeX \
editor."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.7svn58061"

RPM_NAME = "texlive-lni-2023.209.1.7svn58061-55.1.noarch.rpm"
RPM_HASH = "edf4522074abed5add5609b89ae43e284a1d6be013478c3d39406d2f9f470b623128cd68f61e89305ccc399b3ee619c69139a54f89fe0f8021885206ed339587"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lni.cls \
texlive-lni"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-babel.sty \
tex-caption.sty \
tex-ccicons.sty \
tex-cleveref.sty \
tex-cmap.sty \
tex-crop.sty \
tex-csquotes.sty \
tex-eso-pic.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-graphicx.sty \
tex-grffile.sty \
tex-hypcap.sty \
tex-hyperref.sty \
tex-iftex.sty \
tex-inputenc.sty \
tex-listings.sty \
tex-mathptmx.sty \
tex-newtxmath.sty \
tex-newtxtext.sty \
tex-newtxtt.sty \
tex-selnolig.sty \
tex-textcomp.sty \
tex-url.sty \
tex-verbatim.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
