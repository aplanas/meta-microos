SUMMARY = "More gobble macros for PlainTeX and LaTeX"
DESCRIPTION = "The LaTeX package gobble includes several gobble macros not \
included in the LaTeX kernel. These macros remove a number of \
arguments after them, a feature regulary used inside other \
macros. This includes gobble macros for optional arguments. The \
LaTeX package gobble-user provides these macros at the user \
level, i.e. using names without @ so that these can be used \
without \\makeatletter and \\makeatother. The same macros are \
provided inside .tex files for use with plain-TeX or other TeX \
formats. However, the gobble macros for optional macros require \
\\@ifnextchar to be defined."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn64967"

RPM_NAME = "texlive-gobble-2023.209.0.0.2svn64967-54.1.noarch.rpm"
RPM_HASH = "909f45a842c529023f1fa60e922374a9fe696214645624f9b1f1f05f346a441121b8eaa3386b6ccbfd10b0009262ec122de3fe6a084b1089b40c402709cd92d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gobble-user.sty \
tex-gobble-user.tex \
tex-gobble.sty \
tex-gobble.tex \
texlive-gobble"

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
