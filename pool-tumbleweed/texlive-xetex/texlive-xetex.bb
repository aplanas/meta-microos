SUMMARY = "An extended variant of TeX for use with Unicode sources"
DESCRIPTION = "XeTeX is a TeX typesetting engine using Unicode and supporting \
modern font technologies such as OpenType, TrueType or Apple \
Advanced Typography (AAT), including OpenType mathematics \
fonts. XeTeX supports many extensions that reflect its origins \
in linguistic research; it also supports micro-typography (as \
available in pdfTeX). XeTeX was developed by the SIL (the first \
version was specifically developed for those studying \
linguistics, and using Macintosh computers). XeTeX's immediate \
output is an extended variant of DVI format, which is \
ordinarily processed by a tightly bound processor (called \
xdvipdfmx), that produces PDF. XeTeX is released as part of TeX \
Live; documentation has arisen separately. Source code is \
available from ctan:/systems/texlive/Source/."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66203"

RPM_NAME = "texlive-xetex-2023.209.svn66203-53.2.noarch.rpm"
RPM_HASH = "1cd9a77d6f4c524bd62acdfa9dc34c00a5b9e1f74c4d3eeb136edcbd608aabdeba02d121cd270fe4c8f215cf57b59ba626c04eb2dab787f11199b4bcab79e36f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-qx-unicode.map \
tex-tex-text.map \
texlive-xetex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl \
perl-TeXLive--TLUtils \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
tex-texmf.cnf \
texlive \
texlive-atbegshi \
texlive-atveryend \
texlive-babel \
texlive-cm \
texlive-dvipdfmx \
texlive-etex \
texlive-everyshi \
texlive-filesystem \
texlive-firstaid \
texlive-hyphen-base \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3backend \
texlive-l3kernel \
texlive-l3packages \
texlive-latex \
texlive-latex-fonts \
texlive-lm \
texlive-plain \
texlive-scripts \
texlive-scripts-bin \
texlive-tex-ini-files \
texlive-texlive.infra \
texlive-unicode-data \
texlive-xetex-bin \
texlive-xetexconfig"

inherit rpm
