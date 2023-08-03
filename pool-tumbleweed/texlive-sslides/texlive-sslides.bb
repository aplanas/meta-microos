SUMMARY = "Slides with headers and footers"
DESCRIPTION = "The class provides a variant of the LaTeX standard slides \
class, in which the user may add headers and footers to the \
slide."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn32293"

RPM_NAME = "texlive-sslides-2023.209.svn32293-58.1.noarch.rpm"
RPM_HASH = "a99277c2933753a4b906d1ab80ce4265954d91ac628b2a1146e58b2b7226ee5a4f0a20f45198d0a30d630363e98401116e5144c5176dcd6ac2871dc84b20e7cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sslides.cls \
texlive-sslides"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-slides.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
