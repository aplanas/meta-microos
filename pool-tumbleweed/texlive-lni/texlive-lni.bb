SUMMARY = "Official class for the 'Lecture Notes in Informatics'"
DESCRIPTION = "This is the official version of the class 'lni' for submissions \
to the Lecture Notes in Informatics published by the \
Gesellschaft fur Informatik. To use it, download the file \
lni-author-template.tex and edit it in your favorite LaTeX \
editor."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.7svn58061"

RPM_NAME = "texlive-lni-2023.201.1.7svn58061-54.1.noarch.rpm"
RPM_HASH = "0d372eb25e8259416cca1f25ae9343318c415f9252e2ff38f5eb2153dee12edeaf1874c7812ad898ab170dbc839a0485b882cd900cf3efdd79b4295fa8df16e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(lni.cls) \
texlive-lni"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(article.cls) \
tex(babel.sty) \
tex(caption.sty) \
tex(ccicons.sty) \
tex(cleveref.sty) \
tex(cmap.sty) \
tex(crop.sty) \
tex(csquotes.sty) \
tex(eso-pic.sty) \
tex(etoolbox.sty) \
tex(fancyhdr.sty) \
tex(fontenc.sty) \
tex(fontspec.sty) \
tex(graphicx.sty) \
tex(grffile.sty) \
tex(hypcap.sty) \
tex(hyperref.sty) \
tex(iftex.sty) \
tex(inputenc.sty) \
tex(listings.sty) \
tex(mathptmx.sty) \
tex(newtxmath.sty) \
tex(newtxtext.sty) \
tex(newtxtt.sty) \
tex(selnolig.sty) \
tex(textcomp.sty) \
tex(url.sty) \
tex(verbatim.sty) \
tex(xspace.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
