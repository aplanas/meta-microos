SUMMARY = "Write and execute external code, and insert the output"
DESCRIPTION = "This package allows to write MetaPost, TeX, ConTeXt, LaTeX, \
LuaTeX, LuaLaTeX, XeTeX, XeLaTeX, Lua, Perl, or Python source \
code into an external file, run that file via shell-escape to \
create PDF, PNG, or text output, and include that output \
automatically into the main LaTeX document."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.33svn65670"

RPM_NAME = "texlive-hvextern-2023.209.0.0.33svn65670-54.1.noarch.rpm"
RPM_HASH = "48e8431e1bea5cebda8d66ee8f99f511d6f3ff5532b56e4ef70d57c7abade78b1e7ec22e54d222c3e6a1798e9d7f0a786a173f4d2adfc08af2d0d05a6ffc8220"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hvextern.sty \
texlive-hvextern"

RDEPENDS:${PN} += "/usr/bin/sh \
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
