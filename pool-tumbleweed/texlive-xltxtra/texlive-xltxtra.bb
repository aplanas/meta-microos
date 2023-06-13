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

RPM_NAME = "texlive-xltxtra-2023.201.0.0.7svn56594-52.1.noarch.rpm"
RPM_HASH = "b83f30f4e619b662f6f5c846fe0af5c5ba719c33adde9144c7c30f781166df97336f841d05a1bd34d98ec6f42a4cea6be0e6b6284ec5c395c40d3005cc836fc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(xltxtra.sty) \
texlive-xltxtra"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fontspec.sty) \
tex(ifluatex.sty) \
tex(ifxetex.sty) \
tex(metalogo.sty) \
tex(realscripts.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-metalogo \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
