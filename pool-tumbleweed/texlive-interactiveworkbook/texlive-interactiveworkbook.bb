SUMMARY = "LaTeX-based interactive PDF on the Web"
DESCRIPTION = "The package interactiveworkbook gives the user the ability to \
write LaTeX documents which, ultimately, create interactive \
question-and-answer Portable Document Format (PDF) tutorials \
meant to be used by Internet students and that, in particular, \
freely use mathematical notation."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn15878"

RPM_NAME = "texlive-interactiveworkbook-2023.208.svn15878-53.1.noarch.rpm"
RPM_HASH = "33dde0ea759f2eb80b40c4772e014849268c29d5d791eb22f8d3b4d51eb7116c84f17cc7864170ac91e6661d97ef1648ca3cb24a60cd532f654469b13c55afbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-interactiveworkbook-web.sty \
tex-interactiveworkbook.sty \
texlive-interactiveworkbook"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-epsfig.sty \
tex-ifthen.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
