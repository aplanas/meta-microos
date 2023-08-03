SUMMARY = "Marking of hyphenation points"
DESCRIPTION = "The package shows the hyphenation points in the document by \
either inserting small triangles below the baseline or by \
typesetting explicit hyphens. The markers are correctly placed \
even within ligatures and their size adjusts to the font size. \
By option the markers can be placed behind or in front of the \
glyphs. The package requires LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1asvn63578"

RPM_NAME = "texlive-showhyphenation-2023.209.0.0.1asvn63578-54.1.noarch.rpm"
RPM_HASH = "1e3dc2890434189acadd12447902c3a9c816aef54b9fb4ff7dd3881322bf731c8e887876c2df66af1c33829dcafa896ec36f598d33c9fdfe9ace026b3980016b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-showhyphenation.sty \
texlive-showhyphenation"

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
