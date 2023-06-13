SUMMARY = "Galician hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Galician in T1/EC and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58652"

RPM_NAME = "texlive-hyphen-galician-2023.201.svn58652-52.1.noarch.rpm"
RPM_HASH = "ca7a663e0ceccacbf1d21b71513040d0e2c77b1a2b2df32bc7576adfb09cc5b911fdeec2de1092635be32763a600dbc0ab63945b0167c6b82841dbe7d30bb3cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hyph-gl.ec.tex) \
tex(hyph-gl.tex) \
tex(loadhyph-gl.tex) \
texlive-hyphen-galician"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(language.dat) \
tex(language.dat.lua) \
tex(language.def) \
texlive \
texlive-filesystem \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
