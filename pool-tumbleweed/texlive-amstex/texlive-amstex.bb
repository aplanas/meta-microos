SUMMARY = "American Mathematical Society plain TeX macros"
DESCRIPTION = "AMS-TeX is a TeX macro package, originally written by Michael \
Spivak for the American Mathematical Society (AMS) during \
1983-1985 and is described in the book 'The Joy of TeX'. It is \
based on Plain TeX, and provides many features for producing \
more professional-looking maths formulas with less burden on \
authors. This is the final archival distribution of AMS-TeX. \
AMS-TeX is no longer supported by the AMS, nor is it used by \
the AMS publishing program. The AMS does not recommend creating \
any new documents using AMS-TeX; this distribution will be left \
on CTAN to facilitate processing of legacy documents and as a \
historical record of a pioneering TeX macro collection that \
played a key role in popularizing TeX and revolutionizing \
mathematics publishing. In addition to the 'User's Guide to \
AMS-TeX', the AMS has also made the full text of the most \
recent reprint of the second edition of 'The Joy of TeX' by \
Michael Spivak available as a pdf file. AMS-TeX is the \
historical basis of amslatex, which should now be used to \
prepare submissions for the AMS."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.01svn66186"

RPM_NAME = "texlive-amstex-2023.201.2.01svn66186-54.1.noarch.rpm"
RPM_HASH = "2e3597eab91ed970603222eced4ab3ce2c8a3ca78dac9d2df8a7110c8db7f5a6451846281ed52922b0f1933bbfc94da6aa87041fab4c5ae6fd1d1c9fa6c5ffe8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-amstex \
tex-amsppt.sty \
tex-amsppt1.tex \
tex-amstex.tex \
texlive-amstex"

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
texlive-amsfonts \
texlive-amstex-bin \
texlive-cm \
texlive-filesystem \
texlive-hyphen-base \
texlive-knuth-lib \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-plain \
texlive-scripts \
texlive-scripts-bin \
texlive-tex"

inherit rpm
