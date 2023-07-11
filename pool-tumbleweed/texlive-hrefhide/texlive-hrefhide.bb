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

RPM_NAME = "texlive-hrefhide-2023.201.1.1asvn66189-53.2.noarch.rpm"
RPM_HASH = "cdc1ec41388d542febe6dff5a52e9bd62222476b4d78ae356aaa8867e0facc809e24bbd1ce3f00445edfb6976867fc0bff64e7b38989f78724d380eea21deebf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hrefhide.sty \
texlive-hrefhide"

RDEPENDS:${PN} += "/usr/bin/sh \
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
