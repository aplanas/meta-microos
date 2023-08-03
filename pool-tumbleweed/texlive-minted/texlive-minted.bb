SUMMARY = "Highlighted source code for LaTeX"
DESCRIPTION = "The package that facilitates expressive syntax highlighting in \
LaTeX using the powerful Pygments library. The package also \
provides options to customize the highlighted source code \
output using fancyvrb."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.7svn65252"

RPM_NAME = "texlive-minted-2023.209.2.7svn65252-55.1.noarch.rpm"
RPM_HASH = "d6dea3eef7d97d163fa5d7e55c04a34161a3f8aafe58ac65b9d41a530232b4ebb1fd57edbdfdf189cfa68533e4d5769d5e175969ff7a38933334f095d6a4439b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-minted.sty \
tex-minted1.sty \
texlive-minted"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-catchfile.sty \
tex-etoolbox.sty \
tex-fancyvrb.sty \
tex-float.sty \
tex-framed.sty \
tex-fvextra.sty \
tex-ifplatform.sty \
tex-ifthen.sty \
tex-keyval.sty \
tex-kvoptions.sty \
tex-lineno.sty \
tex-newfloat.sty \
tex-pdftexcmds.sty \
tex-shellesc.sty \
tex-xcolor.sty \
tex-xstring.sty \
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
