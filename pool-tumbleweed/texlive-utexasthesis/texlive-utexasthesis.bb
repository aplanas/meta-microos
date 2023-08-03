SUMMARY = "University of Texas at Austin graduate thesis style"
DESCRIPTION = "This class file complies with the Digital Submission \
Requirement for Masters and Ph.D. thesis submissions of the \
University of Texas at Austin."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn48648"

RPM_NAME = "texlive-utexasthesis-2023.209.1.0svn48648-54.1.noarch.rpm"
RPM_HASH = "902caa60eb42158c04f4edcdd8df96857f3ff35ea6bd96c9f1d868d00b0665ae4b3c76561facf8f1a0a6ea85ba50f87c24e9915ff7af78ac26a587cb5178826f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-utexasthesis.cls \
texlive-utexasthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-doi.sty \
tex-fontenc.sty \
tex-geometry.sty \
tex-hyperref.sty \
tex-indentfirst.sty \
tex-natbib.sty \
tex-report.cls \
tex-setspace.sty \
tex-tocbibind.sty \
tex-tocloft.sty \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
