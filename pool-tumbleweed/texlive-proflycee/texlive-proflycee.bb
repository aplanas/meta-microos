SUMMARY = "A LaTeX package for French maths teachers in high school"
DESCRIPTION = "This package provides some commands to help French mathematics \
teachers for 15-18 years olds, for example: \\SplineTikz to \
create splines with 'derivative control'; \
\\CalculFormelParametres and \\CalculFormelLigne in order to \
create an xcas-windows-like; \\CodePythonLstFichier to create \
code presentation and code execution with pythontex."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.5.4svn66581"

RPM_NAME = "texlive-proflycee-2023.201.2.5.4svn66581-52.1.noarch.rpm"
RPM_HASH = "92a5afba012c6505dfbd3e182cf20847daf79e81ef212d3ca1c84b0c0c1178ed096f5580280937a85520929ee6313b8d29782d3ebc7c20e3bd1a15fde7100d6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ProfLycee-old.sty) \
tex(ProfLycee.sty) \
tex(proflycee-tools-minted.tex) \
tex(proflycee-tools-piton.tex) \
tex(proflycee-tools-pythontex.tex) \
texlive-proflycee"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(csvsimple.sty) \
tex(expl3.sty) \
tex(fancyvrb.sty) \
tex(fontawesome5.sty) \
tex(hologo.sty) \
tex(iftex.sty) \
tex(ifthen.sty) \
tex(listofitems.sty) \
tex(mathtools.sty) \
tex(minted.sty) \
tex(nicefrac.sty) \
tex(pgf.sty) \
tex(pgffor.sty) \
tex(piton.sty) \
tex(pythontex.sty) \
tex(randomlist.sty) \
tex(simplekv.sty) \
tex(siunitx.sty) \
tex(tabularray.sty) \
tex(tcolorbox.sty) \
tex(tikz.sty) \
tex(tkz-tab.sty) \
tex(xcolor.sty) \
tex(xfp.sty) \
tex(xintbinhex.sty) \
tex(xintexpr.sty) \
tex(xinttools.sty) \
tex(xkeyval.sty) \
tex(xparse.sty) \
tex(xstring.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
