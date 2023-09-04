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

RPM_NAME = "texlive-gobble-2023.209.0.0.2svn64967-54.2.noarch.rpm"
RPM_HASH = "6fe10d8ddfa2f1a11d338c007708e23da62c91c8764a3a454cfa7e6312bfc198a4d1f4854c4907b59d5bba5a679310a2067d602794a89d5a92b8d8259d622b55"
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
