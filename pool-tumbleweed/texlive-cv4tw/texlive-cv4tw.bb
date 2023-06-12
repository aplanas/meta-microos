SUMMARY = "LaTeX CV class, with extended details"
DESCRIPTION = "The class offers entries for assets and social networks; \
customizable styles are provided. The class comes with no \
documentation, but a worked example offers some guidance."
LICENSE = "LPPL-1.0"

PV = "2023.204.0.0.2svn34577"

RPM_NAME = "texlive-cv4tw-2023.204.0.0.2svn34577-54.1.noarch.rpm"
RPM_HASH = "be269e657af47b206e49fb84fad04122d8bf70033193f17a96b3f3a192eee842d93b69409defa910b01ffce76485be36c44e605dd80eec752552220449f0439c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(cv4tw-scheme.sty) \
tex(cv4tw-theme-compact.sty) \
tex(cv4tw-theme-core.sty) \
tex(cv4tw-theme-sharp.sty) \
tex(cv4tw-theme-simple.sty) \
tex(cv4tw.cls) \
texlive-cv4tw"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amssymb.sty) \
tex(array.sty) \
tex(boxedminipage.sty) \
tex(etoolbox.sty) \
tex(fancyhdr.sty) \
tex(fontawesome.sty) \
tex(fontspec.sty) \
tex(forloop.sty) \
tex(geometry.sty) \
tex(graphicx.sty) \
tex(hyperref.sty) \
tex(lastpage.sty) \
tex(libertine.sty) \
tex(multicol.sty) \
tex(needspace.sty) \
tex(newenviron.sty) \
tex(pbox.sty) \
tex(pifont.sty) \
tex(realboxes.sty) \
tex(xcolor.sty) \
tex(xstring.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
