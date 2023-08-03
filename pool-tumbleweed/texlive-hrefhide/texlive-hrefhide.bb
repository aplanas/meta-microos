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

PV = "2023.209.1.1asvn66189"

RPM_NAME = "texlive-hrefhide-2023.209.1.1asvn66189-54.1.noarch.rpm"
RPM_HASH = "0052b8d4f0aa0d4ca8b45c09d28ef3dc6fa103283b6e3b57563ed433a1a57986acbe5f202553d0acc149370b44501ffefe33934aacaaaff6842755682728fc66"
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
