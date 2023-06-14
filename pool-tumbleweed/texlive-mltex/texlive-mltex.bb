SUMMARY = "The MLTeX system"
DESCRIPTION = "MLTeX is a modification of TeX version >=3.0 that allows the \
hyphenation of words with accented letters using ordinary \
Computer Modern (CM) fonts. The system is distributed as a TeX \
change file."
LICENSE = "SUSE-TeX"

PV = "2023.201.2.2svn62145"

RPM_NAME = "texlive-mltex-2023.201.2.2svn62145-54.1.noarch.rpm"
RPM_HASH = "51efcb001da0398ee1b505c2da6dcf9d510ad97bbdf5241bf9a13b58b9432c54222b34d99bd94a2685435209dfcc96d4704b6b4aea84937ad57a2cf29087e5a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lo1enc.def \
tex-mlltxchg.def \
tex-mltex.sty \
texlive-mltex"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
texlive \
texlive-atbegshi \
texlive-atveryend \
texlive-babel \
texlive-cm \
texlive-dehyph \
texlive-everyshi \
texlive-filesystem \
texlive-firstaid \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-knuth-lib \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3backend \
texlive-l3kernel \
texlive-l3packages \
texlive-latex \
texlive-latex-fonts \
texlive-latexconfig \
texlive-mltex-bin \
texlive-plain \
texlive-scripts \
texlive-scripts-bin \
texlive-tex-ini-files \
texlive-unicode-data"

inherit rpm
