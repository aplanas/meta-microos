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

RPM_NAME = "texlive-xltxtra-2023.209.0.0.7svn56594-53.2.noarch.rpm"
RPM_HASH = "930d479f5f1a8881e8fd3f4dea59cac490cddca876d585db60c2fe8245fded8c8435af48384d586c6c6792885daad32efeb3f8439fa9aa7b81a6774ed280a9ed"
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
