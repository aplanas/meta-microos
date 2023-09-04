SUMMARY = "German hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for German in T1/EC and UTF-8 encodings, \
for traditional and reformed spelling, including Swiss German. \
The package includes the latest patterns from dehyph-exptl \
(known to TeX under names 'german', 'ngerman' and \
'swissgerman'), however 8-bit engines still load old versions \
of patterns for 'german' and 'ngerman' for \
backward-compatibility reasons. Swiss German patterns are \
suitable for Swiss Standard German (Hochdeutsch) not the \
Alemannic dialects spoken in Switzerland (Schwyzerduetsch). \
There are no known patterns for written Schwyzerduetsch."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn59807"

RPM_NAME = "texlive-hyphen-german-2023.209.svn59807-54.1.noarch.rpm"
RPM_HASH = "917814829b0c97efd51692c2402e8c539c04aea1b7d0326d41010cfad1c488e62d29e1cbea2d09e6007a84c80801f1eccac0b90e929be6d5a4345815d73131c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-de-1901.ec.tex \
tex-hyph-de-1901.tex \
tex-hyph-de-1996.ec.tex \
tex-hyph-de-1996.tex \
tex-hyph-de-ch-1901.ec.tex \
tex-hyph-de-ch-1901.tex \
tex-loadhyph-de-1901.tex \
tex-loadhyph-de-1996.tex \
tex-loadhyph-de-ch-1901.tex \
texlive-hyphen-german"

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
texlive-dehyph \
texlive-filesystem \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
