SUMMARY = "Finnish hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Finnish in T1 and UTF-8 encodings. The \
older set, labelled just Ã¢ÂÂfiÃ¢ÂÂ, tries to implement \
etymological rules, while the newer ones (fi-x-school) \
implements the simpler rules taught at Finnish school."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn58652"

RPM_NAME = "texlive-hyphen-finnish-2023.209.svn58652-54.1.noarch.rpm"
RPM_HASH = "def5fc7a7a1c459852b061542fa1f1688a84ab54ed7b16032f4b0067476284d1c2fd26f754cfb03aac26fcb1ed73785da7f1bc62f371595d3b42651fd2ea4d31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-fi-x-school.ec.tex \
tex-hyph-fi-x-school.tex \
tex-hyph-fi.ec.tex \
tex-hyph-fi.tex \
tex-loadhyph-fi-x-school.tex \
tex-loadhyph-fi.tex \
texlive-hyphen-finnish"

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
