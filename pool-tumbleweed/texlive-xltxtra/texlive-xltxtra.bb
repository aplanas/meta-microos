SUMMARY = "'Extras' for LaTeX users of XeTeX"
DESCRIPTION = "This package was previously used to provide a number of \
features that were useful for typesetting documents with \
XeLaTeX. Many of those features have now been incorporated into \
the fontspec package and other packages, but the package \
persists for backwards compatibility. Nowadays, loading xltxtra \
will: load the fontspec, metalogo, and realscripts packages; \
redefine \\showhyphens so it works correctly; and define two \
extra commands: \\vfrac and \\namedglyph."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7svn56594"

RPM_NAME = "texlive-xltxtra-2023.209.0.0.7svn56594-53.1.noarch.rpm"
RPM_HASH = "4084bf7222d403d5a6a30015027e1ace4b14be1986345c9cd04cc296655683c86f913f0edc53716c43c84c50aae0ddb81c9d7479efb83b1de5b139da71cb6656"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xltxtra.sty \
texlive-xltxtra"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-metalogo.sty \
tex-realscripts.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-metalogo \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
