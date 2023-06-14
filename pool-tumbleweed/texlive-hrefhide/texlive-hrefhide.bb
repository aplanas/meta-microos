SUMMARY = "Suppress hyper links when printing"
DESCRIPTION = "This package provides the command \\hrefdisplayonly \
(additionally to \\href provided by the hyperref package). While \
the (hyperlinked) text appears like an ordinary \\href in the \
compiled pdf-file, the same text will be 'hidden' when printing \
the text. Hiding is actually achieved by making the text the \
same colour as the background, thus preserving the layout of \
the rest of the text. Further the commands \\hycon and \\hycoff \
(hyper-colour-on/off) can be used to simulate switching option \
ocgcolorlinks of the hyperref package on and off. This package \
is possibly obsolete, see section 3: 'Alternatives' in the \
documentation."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1asvn66189"

RPM_NAME = "texlive-hrefhide-2023.201.1.1asvn66189-53.1.noarch.rpm"
RPM_HASH = "ab868160de7f91849273365d64b34b434c4c8e2f5f0c2a43198124d7d265b23fc9a704a1228aeaacfbf324b86f99bb0f29a3f99c6282b326eccdcb7d25fa698b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hrefhide.sty \
texlive-hrefhide"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hyperref.sty \
tex-kvoptions.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
