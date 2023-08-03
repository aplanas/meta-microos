SUMMARY = "The MLTeX system"
DESCRIPTION = "MLTeX is a modification of TeX version >=3.0 that allows the \
hyphenation of words with accented letters using ordinary \
Computer Modern (CM) fonts. The system is distributed as a TeX \
change file."
LICENSE = "SUSE-TeX"

PV = "2023.209.2.2svn62145"

RPM_NAME = "texlive-mltex-2023.209.2.2svn62145-55.1.noarch.rpm"
RPM_HASH = "f1b78a1cd108b867a5c2ef9a6c5f9d8826bc665d72e57f5aec6e754e53b79ed1a51959f34c68d2c2ccac12ba3ec8451ded541f9f979deb333c998e94904cdd3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lo1enc.def \
tex-mlltxchg.def \
tex-mltex.sty \
texlive-mltex"

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
