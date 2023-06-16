SUMMARY = "Write and execute external code, and insert the output"
DESCRIPTION = "This package allows to write MetaPost, TeX, ConTeXt, LaTeX, \
LuaTeX, LuaLaTeX, XeTeX, XeLaTeX, Lua, Perl, or Python source \
code into an external file, run that file via shell-escape to \
create PDF, PNG, or text output, and include that output \
automatically into the main LaTeX document."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.33svn65670"

RPM_NAME = "texlive-hvextern-2023.201.0.0.33svn65670-52.1.noarch.rpm"
RPM_HASH = "ca8124055b54d6e91d91b9958cde01a4753164a8df8e421d32d38281cf2297f7ace21409db0c251246e976ab59e03b61f7b56439b5d342d373f799b386f0fe4b"
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
