SUMMARY = "Enhanced \\newfont command"
DESCRIPTION = "This package provides a new command \\newfontx. It is similar to \
the old (and deprecated) command \\newfont in function, but is \
more compatible with NFSS. In particular, one can safely change \
font size after invoking a font command defined by \\newfontx. \
The new command will be useful to users who know much of the \
old \\newfont command, but are unfamiliar with the details of \
NFSS."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2bsvn44173"

RPM_NAME = "texlive-bxnewfont-2023.209.0.0.2bsvn44173-53.1.noarch.rpm"
RPM_HASH = "3e8af9c13ca32ae9b4f15954fe75a9fedf556199bf5e31db55573c51d97368e69b8b2f1341b55da49f4f3f0616ca24bf2bafc5c3ed4d0acf3b73902a1982abb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bxnewfont.sty \
texlive-bxnewfont"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
