SUMMARY = "LaTeX-based interactive PDF on the Web"
DESCRIPTION = "The package interactiveworkbook gives the user the ability to \
write LaTeX documents which, ultimately, create interactive \
question-and-answer Portable Document Format (PDF) tutorials \
meant to be used by Internet students and that, in particular, \
freely use mathematical notation."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-interactiveworkbook-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "1d6fc011f0589560146c8ca73b5288fe55757a3ece12d7f36a252179e96f02448ad20947bdf55e30db21d5188121321e0be534fd47a56611a900efe991e4e5ed"
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
