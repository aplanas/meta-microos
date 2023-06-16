SUMMARY = "Showing kerns in a document"
DESCRIPTION = "The package displays all kerning values in the form of colored \
bars directly at the respective position in the document. \
Positive values are displayed in green, negative values in red. \
The width of the bars corresponds exactly to the respective \
kerning value. By option the bars can be placed behind or in \
front of the glyphs. The package requires LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn63708"

RPM_NAME = "texlive-showkerning-2023.201.0.0.1svn63708-53.1.noarch.rpm"
RPM_HASH = "e64e621cdfb2d0bfad9d53925b3b02baf8b893278947f37d030791ab0411f7e42eaa365ecb85c521b083bac8b8d880273cb031b816c7181da6e50ace5f0b2c6f"
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
