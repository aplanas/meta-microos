SUMMARY = "Optimality Theory tableaux in LaTeX"
DESCRIPTION = "The package makes it easy to create beautiful \
optimality-theoretic tableaux. The LaTeX source is visually \
very similar to a formatted tableau, which makes working with \
the source code painless (well, less painful). A variety of \
stylistic variants are available to suit personal taste. The \
package requires xstring, amssymb, bbding, suffix, colortbl, \
rotating, hhline (optionally), arydshln, and tipa (optionally)."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn59318"

RPM_NAME = "texlive-ot-tableau-2023.201.svn59318-54.1.noarch.rpm"
RPM_HASH = "adec41b0a7a2c5c96e1b16fd1b8d3eb307f6eca3bc6d18b5228a9bc3b671cc7ffde8781a5473a51ec8a17ac2a4a06555e323a58c1c03ffe82b7ac0c0c7c21c7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ot-tableau.sty) \
texlive-ot-tableau"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amssymb.sty) \
tex(arydshln.sty) \
tex(bbding.sty) \
tex(colortbl.sty) \
tex(hhline.sty) \
tex(rotating.sty) \
tex(suffix.sty) \
tex(tipa.sty) \
tex(xstring.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
