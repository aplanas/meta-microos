SUMMARY = "A Simplified Introduction to LaTeX"
DESCRIPTION = "An accessible introduction for the beginner."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn20620"

RPM_NAME = "texlive-simplified-latex-2023.209.svn20620-58.1.noarch.rpm"
RPM_HASH = "b1a268395f4484e81ac0052df9f35831717b69234f592a1210cadb606a7630eaf4177567d25e86bd990e3f6150dd66036ea6e018b8698dbb9634b79767add0e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-simplified-latex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
