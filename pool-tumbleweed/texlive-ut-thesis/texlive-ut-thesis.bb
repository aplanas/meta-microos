SUMMARY = "University of Toronto thesis style"
DESCRIPTION = "This LaTeX document class implements the formatting \
requirements of the University of Toronto School of Graduate \
Studies (SGS), as of Fall 2020 ( \
https://www.sgs.utoronto.ca/academic-progress/program-completio \
n/formatting). For example usage, see the GitHub repository."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.1.7svn65767"

RPM_NAME = "texlive-ut-thesis-2023.209.3.1.7svn65767-54.1.noarch.rpm"
RPM_HASH = "94dbd9c377fbce6e1c878f0d598c8aa970c2306a58dd75bcc22e8523fe95f58d4a675570bf9b2326419f3e35884af0838df1a971f2294ee178911b3a59714251"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ut-thesis.cls \
texlive-ut-thesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-book.cls \
tex-geometry.sty \
tex-setspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
