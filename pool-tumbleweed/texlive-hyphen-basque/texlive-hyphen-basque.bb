SUMMARY = "Basque hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Basque in T1/EC and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn58652"

RPM_NAME = "texlive-hyphen-basque-2023.208.svn58652-53.1.noarch.rpm"
RPM_HASH = "ebf1c643c090054546eaadf5003438deac3fbfbe1f8e5afdb5f6d94c40042ab1640e82261c83a2c4d641f946884604774adeda41d492a779fc62b411385e765a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-eu.ec.tex \
tex-hyph-eu.tex \
tex-loadhyph-eu.tex \
texlive-hyphen-basque"

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
