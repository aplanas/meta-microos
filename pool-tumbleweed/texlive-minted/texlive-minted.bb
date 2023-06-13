SUMMARY = "Highlighted source code for LaTeX"
DESCRIPTION = "The package that facilitates expressive syntax highlighting in \
LaTeX using the powerful Pygments library. The package also \
provides options to customize the highlighted source code \
output using fancyvrb."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.7svn65252"

RPM_NAME = "texlive-minted-2023.201.2.7svn65252-54.1.noarch.rpm"
RPM_HASH = "d6c6ccae3988f22d6d386dc2ca2bc6241b23016a804f34169cc5ab605f6efc5dfe05b075f2f758ef90047586cb1029289882b7f7ddcf3c0e8a4c3df14b7c0bb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(minted.sty) \
tex(minted1.sty) \
texlive-minted"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(calc.sty) \
tex(catchfile.sty) \
tex(etoolbox.sty) \
tex(fancyvrb.sty) \
tex(float.sty) \
tex(framed.sty) \
tex(fvextra.sty) \
tex(ifplatform.sty) \
tex(ifthen.sty) \
tex(keyval.sty) \
tex(kvoptions.sty) \
tex(lineno.sty) \
tex(newfloat.sty) \
tex(pdftexcmds.sty) \
tex(shellesc.sty) \
tex(xcolor.sty) \
tex(xstring.sty) \
texlive \
texlive-catchfile \
texlive-etoolbox \
texlive-fancyvrb \
texlive-filesystem \
texlive-float \
texlive-framed \
texlive-fvextra \
texlive-graphics \
texlive-ifplatform \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-kvoptions \
texlive-lineno \
texlive-pdftexcmds \
texlive-scripts \
texlive-scripts-bin \
texlive-tools \
texlive-upquote \
texlive-xcolor \
texlive-xstring"

inherit rpm
