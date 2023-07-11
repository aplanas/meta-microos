SUMMARY = "Portuguese hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Portuguese in T1/EC and UTF-8 \
encodings."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn58609"

RPM_NAME = "texlive-hyphen-portuguese-2023.208.svn58609-53.1.noarch.rpm"
RPM_HASH = "78f32cd6ae5eace097a2e3327f9463b6fe415c1f7977b9967b77bf54431541618be570478fb92dcc0d16f3a8b65bf2ef4a74251805ab1d7d123445f2678d0aa6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-pt.ec.tex \
tex-hyph-pt.tex \
tex-loadhyph-pt.tex \
texlive-hyphen-portuguese"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
texlive \
texlive-filesystem \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
