SUMMARY = "A LaTeX package for French maths teachers in high school"
DESCRIPTION = "This package provides some commands to help French mathematics \
teachers for 15-18 years olds, for example: \\SplineTikz to \
create splines with 'derivative control'; \
\\CalculFormelParametres and \\CalculFormelLigne in order to \
create an xcas-windows-like; \\CodePythonLstFichier to create \
code presentation and code execution with pythontex."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.5.4svn66581"

RPM_NAME = "texlive-proflycee-2023.209.2.5.4svn66581-53.1.noarch.rpm"
RPM_HASH = "a007e8445bafe16c393316c75c6744db055cd73b546c2fa4007bfacaa0520e64d1604ce9c4d2f9cf2155f5dd85bf08d64a771f68e1dda9e5735986eb8ac5406d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ProfLycee-old.sty \
tex-ProfLycee.sty \
tex-proflycee-tools-minted.tex \
tex-proflycee-tools-piton.tex \
tex-proflycee-tools-pythontex.tex \
texlive-proflycee"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-csvsimple.sty \
tex-expl3.sty \
tex-fancyvrb.sty \
tex-fontawesome5.sty \
tex-hologo.sty \
tex-iftex.sty \
tex-ifthen.sty \
tex-listofitems.sty \
tex-mathtools.sty \
tex-minted.sty \
tex-nicefrac.sty \
tex-pgf.sty \
tex-pgffor.sty \
tex-piton.sty \
tex-pythontex.sty \
tex-randomlist.sty \
tex-simplekv.sty \
tex-siunitx.sty \
tex-tabularray.sty \
tex-tcolorbox.sty \
tex-tikz.sty \
tex-tkz-tab.sty \
tex-xcolor.sty \
tex-xfp.sty \
tex-xintbinhex.sty \
tex-xintexpr.sty \
tex-xinttools.sty \
tex-xkeyval.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
