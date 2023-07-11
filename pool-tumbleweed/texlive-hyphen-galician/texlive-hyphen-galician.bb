SUMMARY = "Galician hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Galician in T1/EC and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn58652"

RPM_NAME = "texlive-hyphen-galician-2023.208.svn58652-53.1.noarch.rpm"
RPM_HASH = "8adb209043bec2fd7e9952f9934f0af3696ab2019c122667a1fdcae51a3cd28a76d46b7fc964c8e9f9639407f5e0146aaa5671bf2b19c8f30581e3f90919c4a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-gl.ec.tex \
tex-hyph-gl.tex \
tex-loadhyph-gl.tex \
texlive-hyphen-galician"

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
