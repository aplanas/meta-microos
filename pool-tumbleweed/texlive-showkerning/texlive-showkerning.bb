SUMMARY = "Showing kerns in a document"
DESCRIPTION = "The package displays all kerning values in the form of colored \
bars directly at the respective position in the document. \
Positive values are displayed in green, negative values in red. \
The width of the bars corresponds exactly to the respective \
kerning value. By option the bars can be placed behind or in \
front of the glyphs. The package requires LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn63708"

RPM_NAME = "texlive-showkerning-2023.209.0.0.1svn63708-54.1.noarch.rpm"
RPM_HASH = "576e3f78f049843a45bdc1e63561cc43dda1b473e99c1edd14e0d96e8ef971a08faa5e2f9339ac2e6c53da0359e0b84066e2c07637989bc80442bba332420a37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-showkerning.sty \
texlive-showkerning"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-luatexbase.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
