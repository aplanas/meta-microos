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

PV = "2023.201.svn66203"

RPM_NAME = "texlive-xetex-2023.201.svn66203-52.1.noarch.rpm"
RPM_HASH = "e99ce5cdcb9a56c4ccdcc3114d4e74016576cf7d97609e9a54bc37285644ddaaa892c31e3e5d84d34b803a1e919b7709a169f1d8e0999fa9cf1df98fab70c918"
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
