SUMMARY = "Write and execute external code, and insert the output"
DESCRIPTION = "This package allows to write MetaPost, TeX, ConTeXt, LaTeX, \
LuaTeX, LuaLaTeX, XeTeX, XeLaTeX, Lua, Perl, or Python source \
code into an external file, run that file via shell-escape to \
create PDF, PNG, or text output, and include that output \
automatically into the main LaTeX document."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.33svn65670"

RPM_NAME = "texlive-hvextern-2023.208.0.0.33svn65670-53.1.noarch.rpm"
RPM_HASH = "36b69d940295dbf25fda1a470bbbb8f73f3bbec417fa518b83ed9aed54e4481607d0856150f06ac549e1bd998003f175c53a5ece4cce413c48efcd37ca4a60ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hvextern.sty \
texlive-hvextern"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
tex-fancyvrb.sty \
tex-filemod.sty \
tex-graphicx.sty \
tex-ifoddpage.sty \
tex-ifplatform.sty \
tex-iftex.sty \
tex-listings.sty \
tex-shellesc.sty \
tex-tcolorbox.sty \
tex-tikz.sty \
tex-xkeyval.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
