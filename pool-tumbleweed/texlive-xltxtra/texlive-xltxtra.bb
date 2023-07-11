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

PV = "2023.201.0.0.7svn56594"

RPM_NAME = "texlive-xltxtra-2023.201.0.0.7svn56594-52.2.noarch.rpm"
RPM_HASH = "656783685d201b2302e80ebaa946839a7a5d990566589e2cb372358676df10f5130f09e11ea7054def420b49ae3f65f5a40301b058f1129973c374c3f2b2adbb"
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
