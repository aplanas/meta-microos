SUMMARY = "Pass verbatim contents through a compiler and reincorporate the resulting output"
DESCRIPTION = "This package augments the fancyvrb and listings packages to \
allow the source code they contain to be checked by an external \
tool (like a compiler). The external tool's messages can be \
automatically reincorporated into the original document. The \
package does not focus on a specific programming language, but \
it is designed to work well with languages and compilers in the \
ML family."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn38300"

RPM_NAME = "texlive-checklistings-2023.209.1.0svn38300-54.1.noarch.rpm"
RPM_HASH = "88f68b832fdf62a6498398c84f75b1edb6a0bdf35e1ab3eb15e69db6328a0dc59634a65181d2d5c0cd743d4091d8ff344236a4480b56dfb0255871889b42c3aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-checklistings.sty \
texlive-checklistings"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-fancyvrb.sty \
tex-keyval.sty \
tex-kvoptions.sty \
tex-listings.sty \
texlive \
texlive-checklistings-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
